// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecCustomRuleActionArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecCustomRuleActionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * **Scopes**: Custom rule
 * 
 * Associates an action with a custom rule. Custom rules are rules that you define yourself and are not part of the Kona Rule Set.
 * 
 * **Related API Endpoint**: [/appsec/v1/configs/{configId}/custom-rules](https://techdocs.akamai.com/application-security/reference/get-configs-custom-rules)
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
 * import com.pulumi.akamai.AppSecCustomRuleAction;
 * import com.pulumi.akamai.AppSecCustomRuleActionArgs;
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
 *         var createCustomRuleAction = new AppSecCustomRuleAction(&#34;createCustomRuleAction&#34;, AppSecCustomRuleActionArgs.builder()        
 *             .configId(configuration.applyValue(getAppSecConfigurationResult -&gt; getAppSecConfigurationResult.configId()))
 *             .securityPolicyId(&#34;gms1_134637&#34;)
 *             .customRuleId(12345)
 *             .customRuleAction(&#34;alert&#34;)
 *             .build());
 * 
 *         ctx.export(&#34;customRuleId&#34;, createCustomRuleAction.customRuleId());
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="akamai:index/appSecCustomRuleAction:AppSecCustomRuleAction")
public class AppSecCustomRuleAction extends com.pulumi.resources.CustomResource {
    /**
     * . Unique identifier of the security configuration associated with the custom rule action being modified.
     * 
     */
    @Export(name="configId", type=Integer.class, parameters={})
    private Output<Integer> configId;

    /**
     * @return . Unique identifier of the security configuration associated with the custom rule action being modified.
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }
    /**
     * . Action to be taken when the custom rule is invoked. Allowed values are:
     * - **alert**. Record the event.
     * - **deny**. Block the request.
     * - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
     * - **none**. Take no action.
     * 
     */
    @Export(name="customRuleAction", type=String.class, parameters={})
    private Output<String> customRuleAction;

    /**
     * @return . Action to be taken when the custom rule is invoked. Allowed values are:
     * - **alert**. Record the event.
     * - **deny**. Block the request.
     * - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
     * - **none**. Take no action.
     * 
     */
    public Output<String> customRuleAction() {
        return this.customRuleAction;
    }
    /**
     * . Unique identifier of the custom rule whose action is being modified.
     * 
     */
    @Export(name="customRuleId", type=Integer.class, parameters={})
    private Output<Integer> customRuleId;

    /**
     * @return . Unique identifier of the custom rule whose action is being modified.
     * 
     */
    public Output<Integer> customRuleId() {
        return this.customRuleId;
    }
    /**
     * . Unique identifier of the security policy associated with the custom rule action being modified.
     * 
     */
    @Export(name="securityPolicyId", type=String.class, parameters={})
    private Output<String> securityPolicyId;

    /**
     * @return . Unique identifier of the security policy associated with the custom rule action being modified.
     * 
     */
    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSecCustomRuleAction(String name) {
        this(name, AppSecCustomRuleActionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecCustomRuleAction(String name, AppSecCustomRuleActionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecCustomRuleAction(String name, AppSecCustomRuleActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecCustomRuleAction:AppSecCustomRuleAction", name, args == null ? AppSecCustomRuleActionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AppSecCustomRuleAction(String name, Output<String> id, @Nullable AppSecCustomRuleActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecCustomRuleAction:AppSecCustomRuleAction", name, state, makeResourceOptions(options, id));
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
    public static AppSecCustomRuleAction get(String name, Output<String> id, @Nullable AppSecCustomRuleActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecCustomRuleAction(name, id, state, options);
    }
}