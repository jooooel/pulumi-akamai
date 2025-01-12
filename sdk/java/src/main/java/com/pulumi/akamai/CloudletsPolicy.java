// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.CloudletsPolicyArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.CloudletsPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/cloudletsPolicy:CloudletsPolicy")
public class CloudletsPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Code for the type of Cloudlet (ALB, AP, AS, CD, ER, FR, IG, or VP)
     * 
     */
    @Export(name="cloudletCode", refs={String.class}, tree="[0]")
    private Output<String> cloudletCode;

    /**
     * @return Code for the type of Cloudlet (ALB, AP, AS, CD, ER, FR, IG, or VP)
     * 
     */
    public Output<String> cloudletCode() {
        return this.cloudletCode;
    }
    /**
     * An integer that corresponds to a Cloudlets policy type (0 or 9)
     * 
     */
    @Export(name="cloudletId", refs={Integer.class}, tree="[0]")
    private Output<Integer> cloudletId;

    /**
     * @return An integer that corresponds to a Cloudlets policy type (0 or 9)
     * 
     */
    public Output<Integer> cloudletId() {
        return this.cloudletId;
    }
    /**
     * The description of this specific policy
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of this specific policy
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Defines the group association for the policy. You must have edit privileges for the group
     * 
     */
    @Export(name="groupId", refs={String.class}, tree="[0]")
    private Output<String> groupId;

    /**
     * @return Defines the group association for the policy. You must have edit privileges for the group
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    /**
     * The version of the Cloudlet specific matchRules
     * 
     */
    @Export(name="matchRuleFormat", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> matchRuleFormat;

    /**
     * @return The version of the Cloudlet specific matchRules
     * 
     */
    public Output<Optional<String>> matchRuleFormat() {
        return Codegen.optional(this.matchRuleFormat);
    }
    /**
     * A JSON structure that defines the rules for this policy
     * 
     */
    @Export(name="matchRules", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> matchRules;

    /**
     * @return A JSON structure that defines the rules for this policy
     * 
     */
    public Output<Optional<String>> matchRules() {
        return Codegen.optional(this.matchRules);
    }
    /**
     * The name of the policy. The name must be unique
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the policy. The name must be unique
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The version number of the policy
     * 
     */
    @Export(name="version", refs={Integer.class}, tree="[0]")
    private Output<Integer> version;

    /**
     * @return The version number of the policy
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }
    /**
     * A JSON encoded list of warnings
     * 
     */
    @Export(name="warnings", refs={String.class}, tree="[0]")
    private Output<String> warnings;

    /**
     * @return A JSON encoded list of warnings
     * 
     */
    public Output<String> warnings() {
        return this.warnings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudletsPolicy(String name) {
        this(name, CloudletsPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudletsPolicy(String name, CloudletsPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudletsPolicy(String name, CloudletsPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/cloudletsPolicy:CloudletsPolicy", name, args == null ? CloudletsPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CloudletsPolicy(String name, Output<String> id, @Nullable CloudletsPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/cloudletsPolicy:CloudletsPolicy", name, state, makeResourceOptions(options, id));
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
    public static CloudletsPolicy get(String name, Output<String> id, @Nullable CloudletsPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudletsPolicy(name, id, state, options);
    }
}
