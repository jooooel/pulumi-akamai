// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.BotmanBotCategoryExceptionArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.BotmanBotCategoryExceptionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/botmanBotCategoryException:BotmanBotCategoryException")
public class BotmanBotCategoryException extends com.pulumi.resources.CustomResource {
    @Export(name="botCategoryException", refs={String.class}, tree="[0]")
    private Output<String> botCategoryException;

    public Output<String> botCategoryException() {
        return this.botCategoryException;
    }
    @Export(name="configId", refs={Integer.class}, tree="[0]")
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }
    @Export(name="securityPolicyId", refs={String.class}, tree="[0]")
    private Output<String> securityPolicyId;

    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BotmanBotCategoryException(String name) {
        this(name, BotmanBotCategoryExceptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BotmanBotCategoryException(String name, BotmanBotCategoryExceptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BotmanBotCategoryException(String name, BotmanBotCategoryExceptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/botmanBotCategoryException:BotmanBotCategoryException", name, args == null ? BotmanBotCategoryExceptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BotmanBotCategoryException(String name, Output<String> id, @Nullable BotmanBotCategoryExceptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/botmanBotCategoryException:BotmanBotCategoryException", name, state, makeResourceOptions(options, id));
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
    public static BotmanBotCategoryException get(String name, Output<String> id, @Nullable BotmanBotCategoryExceptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BotmanBotCategoryException(name, id, state, options);
    }
}