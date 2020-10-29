$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchCriteria.feature");
formatter.feature({
  "line": 2,
  "name": "Search and verify click on Title",
  "description": "",
  "id": "search-and-verify-click-on-title",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Search and verify click on Title",
  "description": "",
  "id": "search-and-verify-click-on-title;search-and-verify-click-on-title",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter searching \"\u003cSearch\u003e\" criteria",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on channel link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Validate channel name",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "search-and-verify-click-on-title;search-and-verify-click-on-title;",
  "rows": [
    {
      "cells": [
        "Search"
      ],
      "line": 10,
      "id": "search-and-verify-click-on-title;search-and-verify-click-on-title;;1"
    },
    {
      "cells": [
        "cucumber architecture"
      ],
      "line": 11,
      "id": "search-and-verify-click-on-title;search-and-verify-click-on-title;;2"
    },
    {
      "cells": [
        "cucumber architecture"
      ],
      "line": 12,
      "id": "search-and-verify-click-on-title;search-and-verify-click-on-title;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Search and verify click on Title",
  "description": "",
  "id": "search-and-verify-click-on-title;search-and-verify-click-on-title;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Launch browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter searching \"cucumber architecture\" criteria",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on channel link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Validate channel name",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchCriteriaClass.launch_browser_and_enter_url()"
});
formatter.result({
  "duration": 26805973466,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cucumber architecture",
      "offset": 17
    }
  ],
  "location": "SearchCriteriaClass.enter_searching_criteria(String)"
});
formatter.result({
  "duration": 1496671194,
  "status": "passed"
});
formatter.match({
  "location": "SearchCriteriaClass.click_on_channel_link()"
});
formatter.result({
  "duration": 3569099491,
  "status": "passed"
});
formatter.match({
  "location": "SearchCriteriaClass.validate_channel_name()"
});
formatter.result({
  "duration": 27627303,
  "status": "passed"
});
formatter.match({
  "location": "SearchCriteriaClass.close_browser()"
});
formatter.result({
  "duration": 1431161994,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Search and verify click on Title",
  "description": "",
  "id": "search-and-verify-click-on-title;search-and-verify-click-on-title;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Launch browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter searching \"cucumber architecture\" criteria",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on channel link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Validate channel name",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchCriteriaClass.launch_browser_and_enter_url()"
});
formatter.result({
  "duration": 21606901516,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cucumber architecture",
      "offset": 17
    }
  ],
  "location": "SearchCriteriaClass.enter_searching_criteria(String)"
});
formatter.result({
  "duration": 673556164,
  "status": "passed"
});
formatter.match({
  "location": "SearchCriteriaClass.click_on_channel_link()"
});
formatter.result({
  "duration": 3656567207,
  "status": "passed"
});
formatter.match({
  "location": "SearchCriteriaClass.validate_channel_name()"
});
formatter.result({
  "duration": 19287440,
  "status": "passed"
});
formatter.match({
  "location": "SearchCriteriaClass.close_browser()"
});
formatter.result({
  "duration": 1743476254,
  "status": "passed"
});
formatter.uri("SearchTest.feature");
formatter.feature({
  "line": 2,
  "name": "Youtube Search Test",
  "description": "",
  "id": "youtube-search-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Youtube Search Positive Test",
  "description": "",
  "id": "youtube-search-test;youtube-search-positive-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open chrome browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter search criteria",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on search button",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchClass.open_chrome_browser_and_enter_url()"
});
formatter.result({
  "duration": 19671214398,
  "status": "passed"
});
formatter.match({
  "location": "SearchClass.enter_search_criteria()"
});
formatter.result({
  "duration": 1675702039,
  "status": "passed"
});
formatter.match({
  "location": "SearchClass.click_on_search_button()"
});
formatter.result({
  "duration": 6254946355,
  "status": "passed"
});
});