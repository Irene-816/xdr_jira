package org.example;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

public @Data @AllArgsConstructor class XDRJiraBody {
   private Fields fields;

}

@Data class Fields{
    private final Project project = new Project();
    private final Issuetype issuetype = new Issuetype();
    private String summary;  // to set
    private final Priority priority = new Priority();
    @SerializedName(value = "customfield_10315")
    private String rawAlert;  // to set

    @SerializedName(value = "customfield_10212")
    private final Source source = new Source();

    @SerializedName(value = "customfield_10333")
    private final String logSourceDomain = "morgan";

    @SerializedName(value = "customfield_10310")
    private final String logSource = "MS_Kafka";

    @SerializedName(value = "customfield_10321")
    private String sampleRawLog;  // to set

    @SerializedName(value = "customfield_10423")
    private final String warningQuantity = "1";

    @SerializedName(value = "customfield_11236")
    private final MSSPSource msspSource = new MSSPSource();

    @SerializedName(value = "customfield_10326")
    private String ruleName;  // to set
}
// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
class Source {
    private final String value = "Cortex XDR";
}

class MSSPSource{
    private final String value = "XDR";
}

class Issuetype{
    private final String name = "Incident";
}

class Priority{
    private final String name = "Low";
}

class Project{
    private final String key = "MSSMORGAN";
}

