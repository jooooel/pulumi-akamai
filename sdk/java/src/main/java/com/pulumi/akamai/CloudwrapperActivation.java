// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.CloudwrapperActivationArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.CloudwrapperActivationState;
import com.pulumi.akamai.outputs.CloudwrapperActivationTimeouts;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/cloudwrapperActivation:CloudwrapperActivation")
public class CloudwrapperActivation extends com.pulumi.resources.CustomResource {
    /**
     * The configuration you want to activate.
     * 
     */
    @Export(name="configId", refs={Integer.class}, tree="[0]")
    private Output<Integer> configId;

    /**
     * @return The configuration you want to activate.
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }
    /**
     * Unique hash value of the configuration.
     * 
     */
    @Export(name="revision", refs={String.class}, tree="[0]")
    private Output<String> revision;

    /**
     * @return Unique hash value of the configuration.
     * 
     */
    public Output<String> revision() {
        return this.revision;
    }
    @Export(name="timeouts", refs={CloudwrapperActivationTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ CloudwrapperActivationTimeouts> timeouts;

    public Output<Optional<CloudwrapperActivationTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CloudwrapperActivation(String name) {
        this(name, CloudwrapperActivationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CloudwrapperActivation(String name, CloudwrapperActivationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CloudwrapperActivation(String name, CloudwrapperActivationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/cloudwrapperActivation:CloudwrapperActivation", name, args == null ? CloudwrapperActivationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CloudwrapperActivation(String name, Output<String> id, @Nullable CloudwrapperActivationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/cloudwrapperActivation:CloudwrapperActivation", name, state, makeResourceOptions(options, id));
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
    public static CloudwrapperActivation get(String name, Output<String> id, @Nullable CloudwrapperActivationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CloudwrapperActivation(name, id, state, options);
    }
}