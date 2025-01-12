// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecCustomRuleArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecCustomRuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/appSecCustomRule:AppSecCustomRule")
public class AppSecCustomRule extends com.pulumi.resources.CustomResource {
    /**
     * Unique identifier of the security configuration
     * 
     */
    @Export(name="configId", refs={Integer.class}, tree="[0]")
    private Output<Integer> configId;

    /**
     * @return Unique identifier of the security configuration
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }
    /**
     * JSON-formatted definition of the custom rule
     * 
     */
    @Export(name="customRule", refs={String.class}, tree="[0]")
    private Output<String> customRule;

    /**
     * @return JSON-formatted definition of the custom rule
     * 
     */
    public Output<String> customRule() {
        return this.customRule;
    }
    @Export(name="customRuleId", refs={Integer.class}, tree="[0]")
    private Output<Integer> customRuleId;

    public Output<Integer> customRuleId() {
        return this.customRuleId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSecCustomRule(String name) {
        this(name, AppSecCustomRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecCustomRule(String name, AppSecCustomRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecCustomRule(String name, AppSecCustomRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecCustomRule:AppSecCustomRule", name, args == null ? AppSecCustomRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AppSecCustomRule(String name, Output<String> id, @Nullable AppSecCustomRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecCustomRule:AppSecCustomRule", name, state, makeResourceOptions(options, id));
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
    public static AppSecCustomRule get(String name, Output<String> id, @Nullable AppSecCustomRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecCustomRule(name, id, state, options);
    }
}
