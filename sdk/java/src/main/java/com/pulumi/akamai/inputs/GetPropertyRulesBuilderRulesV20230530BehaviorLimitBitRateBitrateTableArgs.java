// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTableArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTableArgs();

    @Import(name="bitrateUnit")
    private @Nullable Output<String> bitrateUnit;

    public Optional<Output<String>> bitrateUnit() {
        return Optional.ofNullable(this.bitrateUnit);
    }

    @Import(name="bitrateValue")
    private @Nullable Output<Double> bitrateValue;

    public Optional<Output<Double>> bitrateValue() {
        return Optional.ofNullable(this.bitrateValue);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTableArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTableArgs(GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTableArgs $) {
        this.bitrateUnit = $.bitrateUnit;
        this.bitrateValue = $.bitrateValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTableArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTableArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTableArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTableArgs(Objects.requireNonNull(defaults));
        }

        public Builder bitrateUnit(@Nullable Output<String> bitrateUnit) {
            $.bitrateUnit = bitrateUnit;
            return this;
        }

        public Builder bitrateUnit(String bitrateUnit) {
            return bitrateUnit(Output.of(bitrateUnit));
        }

        public Builder bitrateValue(@Nullable Output<Double> bitrateValue) {
            $.bitrateValue = bitrateValue;
            return this;
        }

        public Builder bitrateValue(Double bitrateValue) {
            return bitrateValue(Output.of(bitrateValue));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTableArgs build() {
            return $;
        }
    }

}