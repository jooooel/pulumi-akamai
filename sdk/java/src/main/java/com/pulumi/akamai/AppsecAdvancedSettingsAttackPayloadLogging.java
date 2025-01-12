// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppsecAdvancedSettingsAttackPayloadLoggingArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppsecAdvancedSettingsAttackPayloadLoggingState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/appsecAdvancedSettingsAttackPayloadLogging:AppsecAdvancedSettingsAttackPayloadLogging")
public class AppsecAdvancedSettingsAttackPayloadLogging extends com.pulumi.resources.CustomResource {
    /**
     * Whether to enable, disable, or update attack payload logging settings
     * 
     */
    @Export(name="attackPayloadLogging", refs={String.class}, tree="[0]")
    private Output<String> attackPayloadLogging;

    /**
     * @return Whether to enable, disable, or update attack payload logging settings
     * 
     */
    public Output<String> attackPayloadLogging() {
        return this.attackPayloadLogging;
    }
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
     * Unique identifier of the security policy
     * 
     */
    @Export(name="securityPolicyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> securityPolicyId;

    /**
     * @return Unique identifier of the security policy
     * 
     */
    public Output<Optional<String>> securityPolicyId() {
        return Codegen.optional(this.securityPolicyId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppsecAdvancedSettingsAttackPayloadLogging(String name) {
        this(name, AppsecAdvancedSettingsAttackPayloadLoggingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppsecAdvancedSettingsAttackPayloadLogging(String name, AppsecAdvancedSettingsAttackPayloadLoggingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppsecAdvancedSettingsAttackPayloadLogging(String name, AppsecAdvancedSettingsAttackPayloadLoggingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appsecAdvancedSettingsAttackPayloadLogging:AppsecAdvancedSettingsAttackPayloadLogging", name, args == null ? AppsecAdvancedSettingsAttackPayloadLoggingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AppsecAdvancedSettingsAttackPayloadLogging(String name, Output<String> id, @Nullable AppsecAdvancedSettingsAttackPayloadLoggingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appsecAdvancedSettingsAttackPayloadLogging:AppsecAdvancedSettingsAttackPayloadLogging", name, state, makeResourceOptions(options, id));
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
    public static AppsecAdvancedSettingsAttackPayloadLogging get(String name, Output<String> id, @Nullable AppsecAdvancedSettingsAttackPayloadLoggingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppsecAdvancedSettingsAttackPayloadLogging(name, id, state, options);
    }
}
