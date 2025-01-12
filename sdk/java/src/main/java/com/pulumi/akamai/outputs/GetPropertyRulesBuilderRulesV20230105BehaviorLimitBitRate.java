// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateBitrateTable;
import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRate {
    private @Nullable List<GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateBitrateTable> bitrateTables;
    private @Nullable Boolean enabled;
    private @Nullable Boolean locked;
    private @Nullable String templateUuid;
    private @Nullable List<GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable> thresholdTables;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRate() {}
    public List<GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateBitrateTable> bitrateTables() {
        return this.bitrateTables == null ? List.of() : this.bitrateTables;
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public List<GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable> thresholdTables() {
        return this.thresholdTables == null ? List.of() : this.thresholdTables;
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateBitrateTable> bitrateTables;
        private @Nullable Boolean enabled;
        private @Nullable Boolean locked;
        private @Nullable String templateUuid;
        private @Nullable List<GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable> thresholdTables;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrateTables = defaults.bitrateTables;
    	      this.enabled = defaults.enabled;
    	      this.locked = defaults.locked;
    	      this.templateUuid = defaults.templateUuid;
    	      this.thresholdTables = defaults.thresholdTables;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder bitrateTables(@Nullable List<GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateBitrateTable> bitrateTables) {
            this.bitrateTables = bitrateTables;
            return this;
        }
        public Builder bitrateTables(GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateBitrateTable... bitrateTables) {
            return bitrateTables(List.of(bitrateTables));
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder thresholdTables(@Nullable List<GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable> thresholdTables) {
            this.thresholdTables = thresholdTables;
            return this;
        }
        public Builder thresholdTables(GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateThresholdTable... thresholdTables) {
            return thresholdTables(List.of(thresholdTables));
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRate build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRate();
            _resultValue.bitrateTables = bitrateTables;
            _resultValue.enabled = enabled;
            _resultValue.locked = locked;
            _resultValue.templateUuid = templateUuid;
            _resultValue.thresholdTables = thresholdTables;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
