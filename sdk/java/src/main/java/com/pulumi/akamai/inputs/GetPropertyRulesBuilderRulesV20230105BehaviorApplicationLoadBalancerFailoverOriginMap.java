// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMap extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMap Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMap();

    @Import(name="fromOriginId")
    private @Nullable String fromOriginId;

    public Optional<String> fromOriginId() {
        return Optional.ofNullable(this.fromOriginId);
    }

    @Import(name="toOriginIds")
    private @Nullable List<String> toOriginIds;

    public Optional<List<String>> toOriginIds() {
        return Optional.ofNullable(this.toOriginIds);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMap() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMap(GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMap $) {
        this.fromOriginId = $.fromOriginId;
        this.toOriginIds = $.toOriginIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMap defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMap $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMap();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMap defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMap(Objects.requireNonNull(defaults));
        }

        public Builder fromOriginId(@Nullable String fromOriginId) {
            $.fromOriginId = fromOriginId;
            return this;
        }

        public Builder toOriginIds(@Nullable List<String> toOriginIds) {
            $.toOriginIds = toOriginIds;
            return this;
        }

        public Builder toOriginIds(String... toOriginIds) {
            return toOriginIds(List.of(toOriginIds));
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorApplicationLoadBalancerFailoverOriginMap build() {
            return $;
        }
    }

}