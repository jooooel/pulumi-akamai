// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class BotmanAkamaiBotCategoryActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotmanAkamaiBotCategoryActionArgs Empty = new BotmanAkamaiBotCategoryActionArgs();

    @Import(name="akamaiBotCategoryAction", required=true)
    private Output<String> akamaiBotCategoryAction;

    public Output<String> akamaiBotCategoryAction() {
        return this.akamaiBotCategoryAction;
    }

    @Import(name="categoryId", required=true)
    private Output<String> categoryId;

    public Output<String> categoryId() {
        return this.categoryId;
    }

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    @Import(name="securityPolicyId", required=true)
    private Output<String> securityPolicyId;

    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    private BotmanAkamaiBotCategoryActionArgs() {}

    private BotmanAkamaiBotCategoryActionArgs(BotmanAkamaiBotCategoryActionArgs $) {
        this.akamaiBotCategoryAction = $.akamaiBotCategoryAction;
        this.categoryId = $.categoryId;
        this.configId = $.configId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotmanAkamaiBotCategoryActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotmanAkamaiBotCategoryActionArgs $;

        public Builder() {
            $ = new BotmanAkamaiBotCategoryActionArgs();
        }

        public Builder(BotmanAkamaiBotCategoryActionArgs defaults) {
            $ = new BotmanAkamaiBotCategoryActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder akamaiBotCategoryAction(Output<String> akamaiBotCategoryAction) {
            $.akamaiBotCategoryAction = akamaiBotCategoryAction;
            return this;
        }

        public Builder akamaiBotCategoryAction(String akamaiBotCategoryAction) {
            return akamaiBotCategoryAction(Output.of(akamaiBotCategoryAction));
        }

        public Builder categoryId(Output<String> categoryId) {
            $.categoryId = categoryId;
            return this;
        }

        public Builder categoryId(String categoryId) {
            return categoryId(Output.of(categoryId));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder securityPolicyId(Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        public BotmanAkamaiBotCategoryActionArgs build() {
            $.akamaiBotCategoryAction = Objects.requireNonNull($.akamaiBotCategoryAction, "expected parameter 'akamaiBotCategoryAction' to be non-null");
            $.categoryId = Objects.requireNonNull($.categoryId, "expected parameter 'categoryId' to be non-null");
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.securityPolicyId = Objects.requireNonNull($.securityPolicyId, "expected parameter 'securityPolicyId' to be non-null");
            return $;
        }
    }

}