@wip
Feature:  User should see columns on the Vehicle models page
User Story  As a user, I want to view columns on the Vehicle models page.

@US161-AC1_1
  Scenario: Verify sales manager has access to the Vehicle Models page

    Given the user logged in as "sales manager"
    When the user hover "Fleet" menu OT
    And the user selects Vehicles Model option OT
    Then the user can see expected columns name in the web-table OT


      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |

  @US161-AC1_2

  Scenario: Verify store manager has access to the Vehicle Models page
    Given the user logged in as "store manager"
    When the user hover "Fleet" menu OT
    And the user selects Vehicles Model option OT
    Then the user can see expected columns name in the web-table OT

      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |

  @US161-AC2_1
  Scenario: Verify driver can NOT access the Vehicle models page
    Given the user logged in as "driver"
    When the user hover "Fleet" menu OT
    And the user selects Vehicles Model option OT
    Then  the user sees the error message "You do not have permission to perform this action." OT

