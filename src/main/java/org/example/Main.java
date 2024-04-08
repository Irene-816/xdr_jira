package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.ToNumberPolicy;
import okhttp3.*;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        OkHttpClient httpClient = new OkHttpClient.Builder()
                .connectTimeout(300, TimeUnit.SECONDS)
                .writeTimeout(300, TimeUnit.SECONDS)
                .readTimeout(300, TimeUnit.SECONDS)
                .build();

        String xdrmessage = "{   \"action\": \"DETECTED\",   \"action_pretty\": \"Detected\",   \"agent_data_collection_status\": false,   \"agent_device_domain\": null,   \"agent_fqdn\": null,   \"agent_os_sub_type\": \"Windows Server 2016 [10.0 (Build 17763)]\",   \"agent_os_type\": \"Windows\",   \"agent_version\": \"8.1.1.43337\",   \"alert_id\": \"1528237\",   \"alert_type\": \"Unclassified\",   \"attempt_counter\": 0,   \"bioc_category_enum_key\": null,   \"bioc_indicator\": null,   \"case_id\": 0,   \"category\": \"Persistence\",   \"deduplicate_tokens\": null,   \"description\": \"A new local scheduled task was created in a rare path scheduledtest and a rare command line. Command line: powershell.exe -executionpolicy bypass -windowsstyle hidden -file C:\\\\Users\\\\wiglafc_priv\\\\Desktop\\\\vault\\\\vault.ps1. A new scheduled task with this command line was seen on 0 endpoints and 0 unique days in the last 30 days. A new scheduled task in this path was seen on 0 endpoints and 0 unique days in the last 30 days. The scheduled task is configured to execute a LOLBIN, which is a frequent attack method\",   \"detection_timestamp\": 1706345024776,   \"end_match_attempt_ts\": 0,   \"endpoint_id\": \"f5649c62b8e640609de6c3f2185e3cfc\",   \"events\": [     {       \"agent_install_type\": \"STANDARD\",       \"agent_host_boot_time\": 1705153961353,       \"event_sub_type\": 2,       \"module_id\": null,       \"association_strength\": 50,       \"dst_association_strength\": null,       \"story_id\": null,       \"event_id\": \"AAABjUoWyTp6/Yd/BRv5vw==\",       \"event_type\": \"RPC Call\",       \"event_timestamp\": 1706345024776,       \"actor_process_instance_id\": \"AdpGJ9GRCCYAAAXkAAAAAA==\",       \"actor_process_image_path\": \"C:\\\\Windows\\\\System32\\\\svchost.exe\",       \"actor_process_image_name\": \"svchost.exe\",       \"actor_process_command_line\": \"C:\\\\Windows\\\\system32\\\\svchost.exe -k netsvcs -p -s Winmgmt\",       \"actor_process_signature_status\": \"Signed\",       \"actor_process_signature_vendor\": \"Microsoft Corporation\",       \"actor_process_image_sha256\": \"2b105fb153b1bcd619b95028612b3a93c60b953eef6837d3bb0099e4207aaf6b\",       \"actor_process_image_md5\": \"4dd18f001ac31d5f48f50f99e4aa1761\",       \"actor_process_causality_id\": \"AdpGJ9GRCCYAAAXkAAAAAA==\",       \"actor_causality_id\": \"AdpGJ9GRCCYAAAXkAAAAAA==\",       \"actor_process_os_pid\": 1508,       \"actor_thread_thread_id\": 6952,       \"causality_actor_process_image_name\": \"svchost.exe\",       \"causality_actor_process_command_line\": \"C:\\\\Windows\\\\system32\\\\svchost.exe -k netsvcs -p -s Winmgmt\",       \"causality_actor_process_image_path\": \"C:\\\\Windows\\\\System32\\\\svchost.exe\",       \"causality_actor_process_signature_vendor\": \"Microsoft Corporation\",       \"causality_actor_process_signature_status\": \"Signed\",       \"causality_actor_causality_id\": \"AdpGJ9GRCCYAAAXkAAAAAA==\",       \"causality_actor_process_execution_time\": 1705153979447,       \"causality_actor_process_image_md5\": \"4dd18f001ac31d5f48f50f99e4aa1761\",       \"causality_actor_process_image_sha256\": \"2b105fb153b1bcd619b95028612b3a93c60b953eef6837d3bb0099e4207aaf6b\",       \"action_file_path\": null,       \"action_file_name\": null,       \"action_file_md5\": null,       \"action_file_sha256\": null,       \"action_file_macro_sha256\": null,       \"action_registry_data\": null,       \"action_registry_key_name\": null,       \"action_registry_value_name\": null,       \"action_registry_full_key\": null,       \"action_local_ip\": null,       \"action_local_ip_v6\": null,       \"action_local_port\": null,       \"action_remote_ip\": null,       \"action_remote_ip_v6\": null,       \"action_remote_port\": null,       \"action_external_hostname\": null,       \"action_country\": \"UNKNOWN\",       \"action_process_instance_id\": null,       \"action_process_causality_id\": null,       \"action_process_image_name\": null,       \"action_process_image_sha256\": null,       \"action_process_image_command_line\": null,       \"action_process_signature_status\": \"N/A\",       \"action_process_signature_vendor\": null,       \"os_actor_effective_username\": null,       \"os_actor_process_instance_id\": \"AdpGJ9Gm9s8AAAaEAAAAAA==\",       \"os_actor_process_image_path\": \"C:\\\\Windows\\\\System32\\\\svchost.exe\",       \"os_actor_process_image_name\": \"svchost.exe\",       \"os_actor_process_command_line\": \"C:\\\\Windows\\\\system32\\\\svchost.exe -k netsvcs -p -s Schedule\",       \"os_actor_process_signature_status\": \"Signed\",       \"os_actor_process_signature_vendor\": \"Microsoft Corporation\",       \"os_actor_process_image_sha256\": \"2b105fb153b1bcd619b95028612b3a93c60b953eef6837d3bb0099e4207aaf6b\",       \"os_actor_process_causality_id\": \"AdpGJ9Gm9s8AAAaEAAAAAA==\",       \"os_actor_causality_id\": null,       \"os_actor_process_os_pid\": 1668,       \"os_actor_thread_thread_id\": 12456,       \"fw_app_id\": null,       \"fw_interface_from\": null,       \"fw_interface_to\": null,       \"fw_rule\": null,       \"fw_rule_id\": null,       \"fw_device_name\": null,       \"fw_serial_number\": null,       \"fw_url_domain\": null,       \"fw_email_subject\": null,       \"fw_email_sender\": null,       \"fw_email_recipient\": null,       \"fw_app_subcategory\": null,       \"fw_app_category\": null,       \"fw_app_technology\": null,       \"fw_vsys\": null,       \"fw_xff\": null,       \"fw_misc\": null,       \"fw_is_phishing\": \"N/A\",       \"dst_agent_id\": null,       \"dst_causality_actor_process_execution_time\": null,       \"dns_query_name\": null,       \"dst_action_external_hostname\": null,       \"dst_action_country\": null,       \"dst_action_external_port\": null,       \"contains_featured_host\": \"NO\",       \"contains_featured_user\": \"NO\",       \"contains_featured_ip\": \"NO\",       \"image_name\": null,       \"image_id\": null,       \"container_id\": null,       \"container_name\": null,       \"namespace\": null,       \"cluster_name\": null,       \"referenced_resource\": null,       \"operation_name\": null,       \"identity_sub_type\": null,       \"identity_type\": null,       \"project\": null,       \"cloud_provider\": null,       \"resource_type\": null,       \"resource_sub_type\": null,       \"user_agent\": null,       \"user_name\": \"NT AUTHORITY\\\\SYSTEM\"     }   ],   \"external_id\": \"e7ad4e10-f07e-4797-aab6-e710ba0bfda6\",   \"filter_rule_id\": null,   \"host_ip\": [     \"10.17.36.7\"   ],   \"host_name\": \"shgmwutl01\",   \"is_pcap\": false,   \"is_whitelisted\": false,   \"last_modified_ts\": 0,   \"local_insert_ts\": 1706345302562,   \"mac\": null,   \"mac_addresses\": null,   \"malicious_urls\": null,   \"matching_service_rule_id\": \"e9238163-64bf-40d1-9568-68c0e9d7fb72\",   \"matching_status\": \"MATCHED\",   \"mitre_tactic_id_and_name\": [     \"TA0003 - Persistence\"   ],   \"mitre_technique_id_and_name\": [     \"T1053 - Scheduled Task/Job\"   ],   \"name\": \"Uncommon local scheduled task created\",   \"original_tags\": [     \"EG:COD_NON_MSSIP_WinSvr\",     \"EG:COD_AXIOM_NON_MSSIP_WIN\",     \"DS:PANW/XDR Agent\",     \"EG:Windwos_UAT_Ring\",     \"DT:Impacket Analytics\"   ],   \"resolution_comment\": null,   \"resolution_status\": \"STATUS_010_NEW\",   \"severity\": \"low\",   \"source\": \"XDR Analytics BIOC\",   \"starred\": false,   \"tags\": [     \"EG:COD_AXIOM_NON_MSSIP_WIN\",     \"EG:COD_NON_MSSIP_WinSvr\",     \"DT:Impacket Analytics\",     \"DS:PANW/XDR Agent\",     \"EG:Windwos_UAT_Ring\"   ] }";
        Gson gson = new GsonBuilder().disableHtmlEscaping().serializeNulls().setObjectToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE).setPrettyPrinting().create();

        Map map = gson.fromJson(xdrmessage, Map.class);
        System.out.println(map.get("name"));
        System.out.println(map.get("alert_id"));
        assert(map.containsKey("alert_id"));
        //System.out.println(gson.toJson(map));

        //ObjectMapper om = new ObjectMapper();
        //Root root = om.readValue(myJsonString, Root.class);
        Fields fields = new Fields();
        fields.setSummary("[XDR #4] " + map.get("name"));
        fields.setRuleName((String) map.get("name"));
        fields.setRawAlert("{code}"+gson.toJson(map)+"{code}");
        fields.setSampleRawLog(xdrmessage);
        XDRJiraBody xdrJiraBody = new XDRJiraBody(fields);
        System.out.println(gson.toJson(xdrJiraBody));




        String BASE_URL = "https://nbc2.pwcmanagedsecurityservices.cn/rest/api/2";
        String token = "QkpThJAdvHFip6EqpQvnC4JfxBS4hpBN5Xu0X0";
//        Request request = new Request.Builder()
//        .url(BASE_URL + "/myself")
//        .addHeader("Authorization", "Bearer " + token)
//                .addHeader("Accept", "application/json")
//                .addHeader("Content-Type", "application/json")
//                .build();

//
//        Call call = httpClient.newCall(request);
//        Response response = call.execute();
//        assert response.body() != null;
//        System.out.println(response.body().string());
        String postBody = gson.toJson(xdrJiraBody);

        Request request = new Request.Builder()
                .url(BASE_URL + "/issue")
                //.addHeader("Authorization", Credentials.basic("username", "password"))
                .addHeader("Authorization", "Bearer " + token)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .post(RequestBody.create(
                        MediaType.get("application/json; charset=utf-8"), postBody))
                                .build();

        Call call = httpClient.newCall(request);
        Response response = call.execute();
        System.out.println(response.code());
        assert response.body() != null;
        System.out.println(response.body().string());
        //assertThat(response.code(), equalTo(201));



    }
}