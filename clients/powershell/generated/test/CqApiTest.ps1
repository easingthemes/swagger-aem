# This file is auto-generated by OpenAPI Generator (https://openapi-generator.tech)
# Please replace "TEST_VALUE" with a proper value and uncomment the code for testing the function

Describe 'Org.OpenAPITools CqApi' {
    Context 'CqApi' {
        It 'Invoke-CqApiGetLoginPage' {
            $ret = Invoke-PetApiGetPetById
            #$ret | Should BeOfType Org.OpenAPITools.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

    Context 'CqApi' {
        It 'Invoke-CqApiPostCqActions' {
            $ret = Invoke-PetApiGetPetById -authorizableId "TEST_VALUE" -changelog "TEST_VALUE"
            #$ret | Should BeOfType Org.OpenAPITools.Model.ModelNameHere
            #$ret.property | Should Be 0
        }
    }

}
