from urllib.request import urlopen
from bs4 import BeautifulSoup
from win10toast import ToastNotifier

crn_interest = ['31176','30084','31171','30588']
#Fetch Course Details
response = urlopen("https://dalonline.dal.ca/PROD/fysktime.P_DisplaySchedule?s_term=201930&s_crn=&s_subj=CSCI&s_numb=&n=21&s_district=All") #PAGE URL
page_source = response.read()
soup = BeautifulSoup(page_source, 'lxml')
table = soup.findAll("table",{'class':'dataentrytable'})[1]
table_body = table.findAll('tr')[2:]

#Parse Details from the returned HTML
alert_list = []
course_classes = []
course_name = None
for row in table_body:
	columns = row.findAll('td')
	if len(columns) == 2:
		course_name = columns[0].b.contents[0].strip()
	elif len(columns) == 23:
		course_meta = {}
		crn = columns[1].b.contents[0].strip()
		course_meta['crn'] = crn
		course_meta['total'] = columns[13].p.contents[0].strip()
		course_meta['cur'] = columns[14].p.contents[0].strip()
		avbl = columns[15].p.contents[0].strip()
		course_meta['avbl'] = avbl
		if crn in crn_interest and int(avbl) > 0:
			alert_list.append(course_name)
		course_classes.append(course_meta)

# Create Windows Toast Notification
toaster = ToastNotifier()
if len(alert_list) != 0:
	toaster.show_toast("Hey Viz,",
                   str(alert_list)+' is now available. Check soon!!',
                   icon_path="img/exclamation.png",
                   duration=10)
else:
	toaster.show_toast("Hey Viz,",
                   'Better luck next hour man!',
                   icon_path="img/sad.png",
                   duration=10)