// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable();

    @Import(name="thresholdUnit")
    private @Nullable String thresholdUnit;

    public Optional<String> thresholdUnit() {
        return Optional.ofNullable(this.thresholdUnit);
    }

    @Import(name="thresholdValue")
    private @Nullable Integer thresholdValue;

    public Optional<Integer> thresholdValue() {
        return Optional.ofNullable(this.thresholdValue);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable(GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable $) {
        this.thresholdUnit = $.thresholdUnit;
        this.thresholdValue = $.thresholdValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable(Objects.requireNonNull(defaults));
        }

        public Builder thresholdUnit(@Nullable String thresholdUnit) {
            $.thresholdUnit = thresholdUnit;
            return this;
        }

        public Builder thresholdValue(@Nullable Integer thresholdValue) {
            $.thresholdValue = thresholdValue;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable build() {
            return $;
        }
    }

}