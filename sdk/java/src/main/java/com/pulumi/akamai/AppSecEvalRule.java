// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecEvalRuleArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecEvalRuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * **Scopes**: Evaluation rule
 * 
 * Creates or modifies an evaluation rule&#39;s action, conditions, and exceptions.
 * Evaluation rules are Kona Rule Set rules used when running a security configuration in evaluation mode.
 * Changes to these rules do not affect the rules used on your production network.
 * 
 * **Related API Endpoints**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/security-policies/{policyId}/eval-rules/{ruleId}](https://techdocs.akamai.com/application-security/reference/put-policy-eval-rule) *and* [/appsec/v1/configs/{configId}/versions/{versionNumber}/security-policies/{policyId}/eval-rules/{ruleId}/condition-exception](https://techdocs.akamai.com/application-security/reference/put-condition-exception)
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
 * import com.pulumi.akamai.AppSecEvalRule;
 * import com.pulumi.akamai.AppSecEvalRuleArgs;
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
 *         var evalRule = new AppSecEvalRule(&#34;evalRule&#34;, AppSecEvalRuleArgs.builder()        
 *             .configId(configuration.applyValue(getAppSecConfigurationResult -&gt; getAppSecConfigurationResult.configId()))
 *             .securityPolicyId(&#34;gms1_134637&#34;)
 *             .ruleId(60029316)
 *             .ruleAction(&#34;deny&#34;)
 *             .conditionException(Files.readString(Paths.get(String.format(&#34;%s/condition_exception.json&#34;, path.module()))))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="akamai:index/appSecEvalRule:AppSecEvalRule")
public class AppSecEvalRule extends com.pulumi.resources.CustomResource {
    /**
     * . Path to a JSON file containing the conditions and exceptions to be applied to the evaluation rule.
     * 
     */
    @Export(name="conditionException", type=String.class, parameters={})
    private Output</* @Nullable */ String> conditionException;

    /**
     * @return . Path to a JSON file containing the conditions and exceptions to be applied to the evaluation rule.
     * 
     */
    public Output<Optional<String>> conditionException() {
        return Codegen.optional(this.conditionException);
    }
    /**
     * . Unique identifier of the security configuration in evaluation mode.
     * 
     */
    @Export(name="configId", type=Integer.class, parameters={})
    private Output<Integer> configId;

    /**
     * @return . Unique identifier of the security configuration in evaluation mode.
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }
    /**
     * . Action to be taken any time the evaluation rule is triggered, Allowed actions are:
     * - **alert**. Record the event.
     * - **deny**. Block the request.
     * - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
     * - **none**. Take no action.
     * 
     */
    @Export(name="ruleAction", type=String.class, parameters={})
    private Output<String> ruleAction;

    /**
     * @return . Action to be taken any time the evaluation rule is triggered, Allowed actions are:
     * - **alert**. Record the event.
     * - **deny**. Block the request.
     * - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
     * - **none**. Take no action.
     * 
     */
    public Output<String> ruleAction() {
        return this.ruleAction;
    }
    /**
     * . Unique identifier of the evaluation rule being modified.
     * 
     */
    @Export(name="ruleId", type=Integer.class, parameters={})
    private Output<Integer> ruleId;

    /**
     * @return . Unique identifier of the evaluation rule being modified.
     * 
     */
    public Output<Integer> ruleId() {
        return this.ruleId;
    }
    /**
     * . Unique identifier of the security policy associated with the evaluation process.
     * 
     */
    @Export(name="securityPolicyId", type=String.class, parameters={})
    private Output<String> securityPolicyId;

    /**
     * @return . Unique identifier of the security policy associated with the evaluation process.
     * 
     */
    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSecEvalRule(String name) {
        this(name, AppSecEvalRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecEvalRule(String name, AppSecEvalRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecEvalRule(String name, AppSecEvalRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecEvalRule:AppSecEvalRule", name, args == null ? AppSecEvalRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AppSecEvalRule(String name, Output<String> id, @Nullable AppSecEvalRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecEvalRule:AppSecEvalRule", name, state, makeResourceOptions(options, id));
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
    public static AppSecEvalRule get(String name, Output<String> id, @Nullable AppSecEvalRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecEvalRule(name, id, state, options);
    }
}