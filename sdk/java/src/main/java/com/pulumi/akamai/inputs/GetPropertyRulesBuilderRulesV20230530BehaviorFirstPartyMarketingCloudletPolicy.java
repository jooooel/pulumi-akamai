// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingCloudletPolicy extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingCloudletPolicy Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingCloudletPolicy();

    @Import(name="id")
    private @Nullable Integer id;

    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingCloudletPolicy() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingCloudletPolicy(GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingCloudletPolicy $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingCloudletPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingCloudletPolicy $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingCloudletPolicy();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingCloudletPolicy defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingCloudletPolicy(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Integer id) {
            $.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorFirstPartyMarketingCloudletPolicy build() {
            return $;
        }
    }

}