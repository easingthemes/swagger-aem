note
 description:"[
		Adobe Experience Manager (AEM) API
 		Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
  		OpenAPI spec version: 3.2.0-pre.0
 	    Contact: opensource@shinesolutions.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class TRUSTSTORE_ITEMS 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    var_alias: detachable STRING_32 
      -- Truststore alias name
    entry_type: detachable STRING_32 
      
    subject: detachable STRING_32 
      -- e.g. \"CN=localhost\"
    issuer: detachable STRING_32 
      -- e.g. \"CN=Admin\"
    not_before: detachable STRING_32 
      -- e.g. \"Sun Jul 01 12:00:00 AEST 2018\"
    not_after: detachable STRING_32 
      -- e.g. \"Sun Jun 30 23:59:50 AEST 2019\"
    serial_number: INTEGER_32 
      -- 18165099476682912368

feature -- Change Element  
 
    set_var_alias (a_name: like var_alias)
        -- Set 'var_alias' with 'a_name'.
      do
        var_alias := a_name
      ensure
        var_alias_set: var_alias = a_name		
      end

    set_entry_type (a_name: like entry_type)
        -- Set 'entry_type' with 'a_name'.
      do
        entry_type := a_name
      ensure
        entry_type_set: entry_type = a_name		
      end

    set_subject (a_name: like subject)
        -- Set 'subject' with 'a_name'.
      do
        subject := a_name
      ensure
        subject_set: subject = a_name		
      end

    set_issuer (a_name: like issuer)
        -- Set 'issuer' with 'a_name'.
      do
        issuer := a_name
      ensure
        issuer_set: issuer = a_name		
      end

    set_not_before (a_name: like not_before)
        -- Set 'not_before' with 'a_name'.
      do
        not_before := a_name
      ensure
        not_before_set: not_before = a_name		
      end

    set_not_after (a_name: like not_after)
        -- Set 'not_after' with 'a_name'.
      do
        not_after := a_name
      ensure
        not_after_set: not_after = a_name		
      end

    set_serial_number (a_name: like serial_number)
        -- Set 'serial_number' with 'a_name'.
      do
        serial_number := a_name
      ensure
        serial_number_set: serial_number = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass TRUSTSTORE_ITEMS%N")
        if attached var_alias as l_var_alias then
          Result.append ("%Nvar_alias:")
          Result.append (l_var_alias.out)
          Result.append ("%N")    
        end  
        if attached entry_type as l_entry_type then
          Result.append ("%Nentry_type:")
          Result.append (l_entry_type.out)
          Result.append ("%N")    
        end  
        if attached subject as l_subject then
          Result.append ("%Nsubject:")
          Result.append (l_subject.out)
          Result.append ("%N")    
        end  
        if attached issuer as l_issuer then
          Result.append ("%Nissuer:")
          Result.append (l_issuer.out)
          Result.append ("%N")    
        end  
        if attached not_before as l_not_before then
          Result.append ("%Nnot_before:")
          Result.append (l_not_before.out)
          Result.append ("%N")    
        end  
        if attached not_after as l_not_after then
          Result.append ("%Nnot_after:")
          Result.append (l_not_after.out)
          Result.append ("%N")    
        end  
        if attached serial_number as l_serial_number then
          Result.append ("%Nserial_number:")
          Result.append (l_serial_number.out)
          Result.append ("%N")    
        end  
      end
end

