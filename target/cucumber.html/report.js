$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("G:/com_yourlogo_pageobjectmodel_withcucumber/src/test/resources/product.feature");
formatter.feature({
  "line": 1,
  "name": "Add product to basket",
  "description": "As a user\r\nI would like to add a product to basket\r\nSo that i can purchase the desired product",
  "id": "add-product-to-basket",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9784856567,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "to select product category",
  "description": "",
  "id": "add-product-to-basket;to-select-product-category",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user is on user home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicked on any category link tab",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user should landed on selected category page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsSteps.user_is_on_user_home_page()"
});
formatter.result({
  "duration": 3640216721,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.user_clicked_on_any_category_link_tab()"
});
formatter.result({
  "duration": 7181019538,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.user_should_landed_on_selected_category_page()"
});
formatter.result({
  "duration": 56396137,
  "status": "passed"
});
formatter.after({
  "duration": 157722643,
  "status": "passed"
});
formatter.before({
  "duration": 11961398585,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "to select the subcategory of the product",
  "description": "",
  "id": "add-product-to-basket;to-select-the-subcategory-of-the-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "user is on product category page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user click on the the subcategory icon",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user should landed on the selected subcategory page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsSteps.user_is_on_category_page()"
});
formatter.result({
  "duration": 5348316281,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.user_click_on_the_the_subcategory_icon()"
});
formatter.result({
  "duration": 1477802268,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.user_should_able_to_see_the_products_of_the_selected_category()"
});
formatter.result({
  "duration": 51733063,
  "status": "passed"
});
formatter.after({
  "duration": 165436687,
  "status": "passed"
});
formatter.before({
  "duration": 8301148999,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User is able to add a product to cart from category page",
  "description": "",
  "id": "add-product-to-basket;user-is-able-to-add-a-product-to-cart-from-category-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "user is on product category page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "user hover over the product",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user click on the add to basket button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "product should be added to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsSteps.user_is_on_category_page()"
});
formatter.result({
  "duration": 5670123364,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.user_hover_over_the_product()"
});
formatter.result({
  "duration": 238396812,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.user_click_on_the_add_to_basket_button()"
});
formatter.result({
  "duration": 107528202,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.the_product_should_be_added_to_the_cart()"
});
formatter.result({
  "duration": 1180434550,
  "status": "passed"
});
formatter.after({
  "duration": 130187561,
  "status": "passed"
});
formatter.before({
  "duration": 9802548249,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "user is able to add a product to cart from subcategory link",
  "description": "",
  "id": "add-product-to-basket;user-is-able-to-add-a-product-to-cart-from-subcategory-link",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "user is on product subcategory page",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "user hover over the product",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user click on the add to basket button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "product should be added to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsSteps.user_is_on_product_subcategory_page()"
});
formatter.result({
  "duration": 6421327311,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.user_hover_over_the_product()"
});
formatter.result({
  "duration": 193259131,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.user_click_on_the_add_to_basket_button()"
});
formatter.result({
  "duration": 111214242,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.the_product_should_be_added_to_the_cart()"
});
formatter.result({
  "duration": 1175790360,
  "status": "passed"
});
formatter.after({
  "duration": 138830196,
  "status": "passed"
});
formatter.before({
  "duration": 7962138338,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "user is able to see product detail",
  "description": "",
  "id": "add-product-to-basket;user-is-able-to-see-product-detail",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "user is on product subcategory page",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "user click on the product",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user should landed on the product detail info page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsSteps.user_is_on_product_subcategory_page()"
});
formatter.result({
  "duration": 7589466027,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.user_click_on_the_product()"
});
formatter.result({
  "duration": 1387130755,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.user_should_landed_on_the_product_detail_info_page()"
});
formatter.result({
  "duration": 90975707,
  "status": "passed"
});
formatter.after({
  "duration": 174145415,
  "status": "passed"
});
formatter.before({
  "duration": 9470376408,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "user is able to see product detail by clicking on more tab on it",
  "description": "",
  "id": "add-product-to-basket;user-is-able-to-see-product-detail-by-clicking-on-more-tab-on-it",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 45,
  "name": "user is on product subcategory page",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "user hover over the product",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "click on the more button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user should landed on the product detail info page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsSteps.user_is_on_product_subcategory_page()"
});
formatter.result({
  "duration": 10583860404,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.user_hover_over_the_product()"
});
formatter.result({
  "duration": 197398794,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.click_on_the_more_button()"
});
formatter.result({
  "duration": 1292112267,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.user_should_landed_on_the_product_detail_info_page()"
});
formatter.result({
  "duration": 97952870,
  "status": "passed"
});
formatter.after({
  "duration": 133641249,
  "status": "passed"
});
formatter.before({
  "duration": 9278529459,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "user is able to see quick view of the product",
  "description": "",
  "id": "add-product-to-basket;user-is-able-to-see-quick-view-of-the-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 53,
  "name": "user is on product subcategory page",
  "keyword": "Given "
});
formatter.step({
  "line": 54,
  "name": "user hover over the product",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "click on the quick view tab",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "user should able to see quick view of the product",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsSteps.user_is_on_product_subcategory_page()"
});
formatter.result({
  "duration": 6498150001,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.user_hover_over_the_product()"
});
formatter.result({
  "duration": 200473984,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.click_on_the_quick_view_tab()"
});
formatter.result({
  "duration": 172500469,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.user_should_able_to_see_quick_view_of_the_product()"
});
formatter.result({
  "duration": 1401124902,
  "status": "passed"
});
formatter.after({
  "duration": 142209580,
  "status": "passed"
});
formatter.before({
  "duration": 9855438973,
  "status": "passed"
});
formatter.scenario({
  "line": 59,
  "name": "user is able to select the size, colour and add to cart from product detail page",
  "description": "",
  "id": "add-product-to-basket;user-is-able-to-select-the-size,-colour-and-add-to-cart-from-product-detail-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 61,
  "name": "user is on product detail page",
  "keyword": "Given "
});
formatter.step({
  "line": 62,
  "name": "user select the size",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "user choose the colour",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "user choose the quantity",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "product should be added to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsSteps.user_is_on_product_detail_page()"
});
formatter.result({
  "duration": 7879365602,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.user_select_the_size()"
});
formatter.result({
  "duration": 10224179754,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of all [[[ChromeDriver: chrome on WINDOWS (f944774dc289e7f822e49f0296da01e4)] -\u003e css selector: #group_1.form-control.attribute_select.no-print]] (tried for 10 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ACER-PC\u0027, ip: \u0027192.168.5.1\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\ACER\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:49619}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: f944774dc289e7f822e49f0296da01e4\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat com_yourlogo_qa_pages.WomenPage.selectSize(WomenPage.java:181)\r\n\tat com_yourlogo_qa_stepdefinitions.ProductsSteps.user_select_the_size(ProductsSteps.java:179)\r\n\tat ✽.When user select the size(G:/com_yourlogo_pageobjectmodel_withcucumber/src/test/resources/product.feature:62)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ProductsSteps.user_Choose_the_colour()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductsSteps.user_choose_the_quantity()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductsSteps.click_on_add_to_cart_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProductsSteps.the_product_should_be_added_to_the_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2103303150,
  "status": "passed"
});
});