// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecSiemSettingsArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecSiemSettingsState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * **Scopes**: Security configuration
 * 
 * Modifies SIEM (Security Information and Event Management) integration settings for a security configuration.
 * 
 * **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/siem](https://techdocs.akamai.com/application-security/reference/put-siem)
 * 
 * ## Example Usage
 * 
 * Basic usage:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.akamai.AkamaiFunctions;
 * import com.pulumi.akamai.inputs.GetAppSecConfigurationArgs;
 * import com.pulumi.akamai.inputs.GetAppSecSiemDefinitionsArgs;
 * import com.pulumi.akamai.inputs.GetAppSecSecurityPolicyArgs;
 * import com.pulumi.akamai.AppSecSiemSettings;
 * import com.pulumi.akamai.AppSecSiemSettingsArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var configuration = AkamaiFunctions.getAppSecConfiguration(GetAppSecConfigurationArgs.builder()
 *             .name(&#34;Documentation&#34;)
 *             .build());
 * 
 *         final var siemDefinition = AkamaiFunctions.getAppSecSiemDefinitions(GetAppSecSiemDefinitionsArgs.builder()
 *             .siemDefinitionName(&#34;SIEM Version 01&#34;)
 *             .build());
 * 
 *         final var securityPolicies = AkamaiFunctions.getAppSecSecurityPolicy(GetAppSecSecurityPolicyArgs.builder()
 *             .configId(configuration.applyValue(getAppSecConfigurationResult -&gt; getAppSecConfigurationResult.configId()))
 *             .build());
 * 
 *         var siem = new AppSecSiemSettings(&#34;siem&#34;, AppSecSiemSettingsArgs.builder()        
 *             .configId(configuration.applyValue(getAppSecConfigurationResult -&gt; getAppSecConfigurationResult.configId()))
 *             .enableSiem(true)
 *             .enableForAllPolicies(false)
 *             .enableBotmanSiem(true)
 *             .siemId(siemDefinition.applyValue(getAppSecSiemDefinitionsResult -&gt; getAppSecSiemDefinitionsResult.id()))
 *             .securityPolicyIds(securityPolicies.applyValue(getAppSecSecurityPolicyResult -&gt; getAppSecSecurityPolicyResult.securityPolicyIdLists()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Output Options
 * 
 * The following options can be used to determine the information returned, and how that returned information is formatted:
 * 
 * - `output_text`. Tabular report showing the updated SIEM integration settings.
 * 
 */
@ResourceType(type="akamai:index/appSecSiemSettings:AppSecSiemSettings")
public class AppSecSiemSettings extends com.pulumi.resources.CustomResource {
    /**
     * . Unique identifier of the security configuration associated with the SIEM settings being modified.
     * 
     */
    @Export(name="configId", type=Integer.class, parameters={})
    private Output<Integer> configId;

    /**
     * @return . Unique identifier of the security configuration associated with the SIEM settings being modified.
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }
    /**
     * . Set to **true** to include Bot Manager events in your SIEM events; set to **false** to exclude Bot Manager events from your SIEM events.
     * 
     */
    @Export(name="enableBotmanSiem", type=Boolean.class, parameters={})
    private Output<Boolean> enableBotmanSiem;

    /**
     * @return . Set to **true** to include Bot Manager events in your SIEM events; set to **false** to exclude Bot Manager events from your SIEM events.
     * 
     */
    public Output<Boolean> enableBotmanSiem() {
        return this.enableBotmanSiem;
    }
    /**
     * . Set to **true** to enable SIEM on all security policies in the security configuration; set to **false** to only enable SIEM on the security policies specified by the `security_policy_ids` argument.
     * 
     */
    @Export(name="enableForAllPolicies", type=Boolean.class, parameters={})
    private Output<Boolean> enableForAllPolicies;

    /**
     * @return . Set to **true** to enable SIEM on all security policies in the security configuration; set to **false** to only enable SIEM on the security policies specified by the `security_policy_ids` argument.
     * 
     */
    public Output<Boolean> enableForAllPolicies() {
        return this.enableForAllPolicies;
    }
    /**
     * . Set to **true** to enable SIEM; set to **false** to disable SIEM.
     * 
     */
    @Export(name="enableSiem", type=Boolean.class, parameters={})
    private Output<Boolean> enableSiem;

    /**
     * @return . Set to **true** to enable SIEM; set to **false** to disable SIEM.
     * 
     */
    public Output<Boolean> enableSiem() {
        return this.enableSiem;
    }
    /**
     * JSON array of IDs for the security policies where SIEM integration is to be enabled.
     * 
     */
    @Export(name="securityPolicyIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityPolicyIds;

    /**
     * @return JSON array of IDs for the security policies where SIEM integration is to be enabled.
     * 
     */
    public Output<Optional<List<String>>> securityPolicyIds() {
        return Codegen.optional(this.securityPolicyIds);
    }
    /**
     * . Unique identifier of the SIEM settings being modified.
     * 
     */
    @Export(name="siemId", type=Integer.class, parameters={})
    private Output<Integer> siemId;

    /**
     * @return . Unique identifier of the SIEM settings being modified.
     * 
     */
    public Output<Integer> siemId() {
        return this.siemId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSecSiemSettings(String name) {
        this(name, AppSecSiemSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecSiemSettings(String name, AppSecSiemSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecSiemSettings(String name, AppSecSiemSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecSiemSettings:AppSecSiemSettings", name, args == null ? AppSecSiemSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AppSecSiemSettings(String name, Output<String> id, @Nullable AppSecSiemSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecSiemSettings:AppSecSiemSettings", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AppSecSiemSettings get(String name, Output<String> id, @Nullable AppSecSiemSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecSiemSettings(name, id, state, options);
    }
}