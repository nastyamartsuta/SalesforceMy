# mvn versions:display-dependency-updates
[INFO] The following dependencies in Dependencies have newer versions:
[INFO]   io.github.bonigarcia:webdrivermanager ................. 4.4.1 -> 4.4.3
[INFO]   org.seleniumhq.selenium:selenium-java ....... 3.141.59 -> 4.0.0-beta-3
[INFO]   org.testng:testng ..................................... 7.1.0 -> 7.4.0

# mvn versions:use-latest-versions
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------< groupId:SalesforceMy >------------------------
[INFO] Building SalesforceMy 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- versions-maven-plugin:2.8.1:use-latest-versions (default-cli) @ SalesforceMy ---
[INFO] Major version changes allowed
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.349 s
[INFO] Finished at: 2021-05-30T22:29:30+03:00

# mvn clean test
[INFO] Results:
[INFO]
[ERROR] Failures:
[ERROR] tests.ContactTest.creatingAndValidatingAnAccount
[INFO]   Run 1: PASS
[INFO]   Run 2: PASS
[ERROR]   Run 3: ContactTest.creatingAndValidatingAnAccount:20 ? ElementClickIntercepted elemen...
[INFO]
[INFO]
[ERROR] Tests run: 3, Failures: 1, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  06:36 min
[INFO] Finished at: 2021-05-30T22:38:42+03:00

