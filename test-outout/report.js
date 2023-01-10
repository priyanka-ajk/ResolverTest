$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/resol.feature");
formatter.feature({
  "line": 2,
  "name": "Resolver Test",
  "description": "",
  "id": "resolver-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TC"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Test Email and Password",
  "description": "",
  "id": "resolver-test;test-email-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TCTest1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on sample login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "email, password and login button is present",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10
    },
    {
      "cells": [
        "priyankavijaykumar555@gmail.com",
        "Cheryl@123"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on signin button",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.user_is_on_sample_login_page()"
});
formatter.result({
  "duration": 6360246200,
  "status": "passed"
});
formatter.match({
  "location": "Test.email_password_and_login_button_is_present()"
});
formatter.result({
  "duration": 140468600,
  "status": "passed"
});
formatter.match({
  "location": "Test.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 316837300,
  "status": "passed"
});
formatter.match({
  "location": "Test.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 305575300,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Test List Items",
  "description": "",
  "id": "resolver-test;test-list-items",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@TCTest2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user is on sample login page now",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "user checks there are three values in the listgroup",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user checks second list item\u0027s value",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user checks second item\u0027s badge value",
  "keyword": "And "
});
formatter.match({
  "location": "Test.user_is_on_sample_login_page_now()"
});
formatter.result({
  "duration": 4600313400,
  "status": "passed"
});
formatter.match({
  "location": "Test.user_checks_there_are_three_values_in_the_listgroup()"
});
formatter.result({
  "duration": 40231000,
  "status": "passed"
});
formatter.match({
  "location": "Test.user_checks_second_list_item_s_value()"
});
formatter.result({
  "duration": 52674500,
  "status": "passed"
});
formatter.match({
  "location": "Test.user_checks_second_item_s_badge_value()"
});
formatter.result({
  "duration": 317747000,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Test Options",
  "description": "",
  "id": "resolver-test;test-options",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@TCTest3"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "user is on the sample login page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user checks default selected value",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user selects from the list",
  "keyword": "And "
});
formatter.match({
  "location": "Test.user_is_on_the_sample_login_page()"
});
formatter.result({
  "duration": 3679299600,
  "status": "passed"
});
formatter.match({
  "location": "Test.user_checks_default_selected_value()"
});
formatter.result({
  "duration": 62626900,
  "status": "passed"
});
formatter.match({
  "location": "Test.user_selects_from_the_list()"
});
formatter.result({
  "duration": 587597400,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Test Buttons",
  "description": "",
  "id": "resolver-test;test-buttons",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@TCTest4"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "user checks if button is enabled",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user checks in button is disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.user_is_on_login_page()"
});
formatter.result({
  "duration": 3827402900,
  "status": "passed"
});
formatter.match({
  "location": "Test.user_checks_if_button_is_enabled()"
});
formatter.result({
  "duration": 67803600,
  "status": "passed"
});
formatter.match({
  "location": "Test.user_checks_in_button_is_disabled()"
});
formatter.result({
  "duration": 240261400,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Test messages",
  "description": "",
  "id": "resolver-test;test-messages",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@TCTest5"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "user waits for the button to be displayed and clicks on it",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "user checks if the message is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "user checks if the button is now displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 3579058900,
  "status": "passed"
});
formatter.match({
  "location": "Test.user_waits_for_the_button_to_be_displayed_and_clicks_on_it()"
});
formatter.result({
  "duration": 2480935400,
  "status": "passed"
});
formatter.match({
  "location": "Test.user_checks_if_the_message_is_displayed()"
});
formatter.result({
  "duration": 46868600,
  "status": "passed"
});
formatter.match({
  "location": "Test.user_checks_if_the_button_is_now_displayed()"
});
formatter.result({
  "duration": 16244513600,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Test cells",
  "description": "",
  "id": "resolver-test;test-cells",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@TCTest6"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "user is on the login page now",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "user finds the value of any cell on the grid",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "user finds cell at coordinates",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "user check the value of the cell",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.user_is_on_the_login_page_now()"
});
formatter.result({
  "duration": 3747644100,
  "status": "passed"
});
formatter.match({
  "location": "Test.user_finds_the_value_of_any_cell_on_the_grid()"
});
formatter.result({
  "duration": 64235900,
  "status": "passed"
});
formatter.match({
  "location": "Test.user_finds_cell_at_coordinates()"
});
formatter.result({
  "duration": 41899600,
  "status": "passed"
});
formatter.match({
  "location": "Test.user_check_the_value_of_the_cell()"
});
formatter.result({
  "duration": 201492500,
  "status": "passed"
});
});