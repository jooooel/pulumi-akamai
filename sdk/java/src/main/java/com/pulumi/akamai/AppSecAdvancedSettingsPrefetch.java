// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecAdvancedSettingsPrefetchArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecAdvancedSettingsPrefetchState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * **Scopes**: Security configuration
 * 
 * Enables inspection of internal requests (that is, requests between your origin servers and Akamai&#39;s edge servers). You can also use this resource to apply rate controls to prefetch requests.
 * 
 * When prefetch is enabled, internal requests are inspected by your firewall the same way that external requests (requests that originate outside the firewall and outside Akamai&#39;s edge servers) are inspected.
 * 
 * This operation applies at the security configuration level, meaning that the settings affect all the security policies in that configuration.
 * 
 * **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/advanced-settings/prefetch](https://techdocs.akamai.com/application-security/reference/put-advanced-settings-prefetch)
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
 * import com.pulumi.akamai.AppSecAdvancedSettingsPrefetch;
 * import com.pulumi.akamai.AppSecAdvancedSettingsPrefetchArgs;
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
 *         var prefetch = new AppSecAdvancedSettingsPrefetch(&#34;prefetch&#34;, AppSecAdvancedSettingsPrefetchArgs.builder()        
 *             .configId(configuration.applyValue(getAppSecConfigurationResult -&gt; getAppSecConfigurationResult.configId()))
 *             .enableAppLayer(false)
 *             .allExtensions(true)
 *             .enableRateControls(false)
 *             .extensions(            
 *                 &#34;.tiff&#34;,
 *                 &#34;.bmp&#34;,
 *                 &#34;.jpg&#34;,
 *                 &#34;.gif&#34;,
 *                 &#34;.png&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="akamai:index/appSecAdvancedSettingsPrefetch:AppSecAdvancedSettingsPrefetch")
public class AppSecAdvancedSettingsPrefetch extends com.pulumi.resources.CustomResource {
    /**
     * . Set to **true** to enable prefetch requests for all file extensions; set to **false** to enable prefetch requests on only a specified set of file extensions. If set to false you must include the `extensions` argument.
     * 
     */
    @Export(name="allExtensions", type=Boolean.class, parameters={})
    private Output<Boolean> allExtensions;

    /**
     * @return . Set to **true** to enable prefetch requests for all file extensions; set to **false** to enable prefetch requests on only a specified set of file extensions. If set to false you must include the `extensions` argument.
     * 
     */
    public Output<Boolean> allExtensions() {
        return this.allExtensions;
    }
    /**
     * . Unique identifier of the security configuration associated with the prefetch settings being modified.
     * 
     */
    @Export(name="configId", type=Integer.class, parameters={})
    private Output<Integer> configId;

    /**
     * @return . Unique identifier of the security configuration associated with the prefetch settings being modified.
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }
    /**
     * . Set to **true** to enable prefetch requests; set to **false** to disable prefetch requests.
     * 
     */
    @Export(name="enableAppLayer", type=Boolean.class, parameters={})
    private Output<Boolean> enableAppLayer;

    /**
     * @return . Set to **true** to enable prefetch requests; set to **false** to disable prefetch requests.
     * 
     */
    public Output<Boolean> enableAppLayer() {
        return this.enableAppLayer;
    }
    /**
     * . Set to **true** to enable prefetch requests for rate controls; set to **false** to disable prefetch requests for rate controls.
     * 
     */
    @Export(name="enableRateControls", type=Boolean.class, parameters={})
    private Output<Boolean> enableRateControls;

    /**
     * @return . Set to **true** to enable prefetch requests for rate controls; set to **false** to disable prefetch requests for rate controls.
     * 
     */
    public Output<Boolean> enableRateControls() {
        return this.enableRateControls;
    }
    /**
     * . If `all_extensions` is **false**, this must be a JSON array of all the file extensions for which prefetch requests are enabled: prefetch requests won&#39;t be used with any file extensions not included in the array. If `all_extensions` is **true**, then this argument must be set to an empty array: **[]**.
     * 
     */
    @Export(name="extensions", type=List.class, parameters={String.class})
    private Output<List<String>> extensions;

    /**
     * @return . If `all_extensions` is **false**, this must be a JSON array of all the file extensions for which prefetch requests are enabled: prefetch requests won&#39;t be used with any file extensions not included in the array. If `all_extensions` is **true**, then this argument must be set to an empty array: **[]**.
     * 
     */
    public Output<List<String>> extensions() {
        return this.extensions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSecAdvancedSettingsPrefetch(String name) {
        this(name, AppSecAdvancedSettingsPrefetchArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecAdvancedSettingsPrefetch(String name, AppSecAdvancedSettingsPrefetchArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecAdvancedSettingsPrefetch(String name, AppSecAdvancedSettingsPrefetchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecAdvancedSettingsPrefetch:AppSecAdvancedSettingsPrefetch", name, args == null ? AppSecAdvancedSettingsPrefetchArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AppSecAdvancedSettingsPrefetch(String name, Output<String> id, @Nullable AppSecAdvancedSettingsPrefetchState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecAdvancedSettingsPrefetch:AppSecAdvancedSettingsPrefetch", name, state, makeResourceOptions(options, id));
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
    public static AppSecAdvancedSettingsPrefetch get(String name, Output<String> id, @Nullable AppSecAdvancedSettingsPrefetchState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecAdvancedSettingsPrefetch(name, id, state, options);
    }
}