chrome.runtime.onInstalled.addListener(function() {
        
});

window.addEventListener('load', function load(event) {
	fetch_result();
	setInterval(fetch_result,5*60*1000);// Refresh frequency
});

fetch_result = function(){
	var requiredCRN = ['30372'];
	dal_url = "https://dalonline.dal.ca/PROD/fysktime.P_DisplaySchedule?s_term=201930&s_subj=CSCI&s_district=All";
	var xhr = new XMLHttpRequest();
	xhr.open("GET", dal_url , true);
	xhr.onreadystatechange = function() {
  		if (xhr.readyState == 4) {
    		// innerText does not let the attacker inject HTML elements.
    		//var elements = $.parseHTML(xhr.responseText);
    		$("#hiddenElement").html(xhr.responseText)
    		var table = $('table.dataentrytable')[1];
    		var rows = $(table).children('tbody').children('tr:gt(1)');
    		$.each(rows, function( index, row ) {
  				//Check if the row is not a header row
  				var col = $(row).children('td.detthdr');
  				if(col.length > 0){
  					console.log($(col).children('b').text());
  				} else {
  					col = $(row).children('td.dettl');
  					var crn = $($(col)[1]).children('b').text();
  					var availability = $($(col)[15]).children('p').text();
  					if(requiredCRN.indexOf(crn) >= 0 && parseInt(availability) > 0){
  						console.log('Available');
  					}
  					//chrome.notifications.create('hey!')
  				}
			});
    		//var tables = document.getElementsByTagName("table");
    		console.log("Number of Tables",rows);
  		}
	}
	xhr.send();
}
//