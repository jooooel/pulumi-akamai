// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530CriterionMatchResponseCode {
    private @Nullable Boolean locked;
    private @Nullable Integer lowerBound;
    private @Nullable String matchOperator;
    private @Nullable String templateUuid;
    private @Nullable Integer upperBound;
    private @Nullable String uuid;
    private @Nullable List<String> values;

    private GetPropertyRulesBuilderRulesV20230530CriterionMatchResponseCode() {}
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<Integer> lowerBound() {
        return Optional.ofNullable(this.lowerBound);
    }
    public Optional<String> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<Integer> upperBound() {
        return Optional.ofNullable(this.upperBound);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530CriterionMatchResponseCode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean locked;
        private @Nullable Integer lowerBound;
        private @Nullable String matchOperator;
        private @Nullable String templateUuid;
        private @Nullable Integer upperBound;
        private @Nullable String uuid;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530CriterionMatchResponseCode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
    	      this.lowerBound = defaults.lowerBound;
    	      this.matchOperator = defaults.matchOperator;
    	      this.templateUuid = defaults.templateUuid;
    	      this.upperBound = defaults.upperBound;
    	      this.uuid = defaults.uuid;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder lowerBound(@Nullable Integer lowerBound) {
            this.lowerBound = lowerBound;
            return this;
        }
        @CustomType.Setter
        public Builder matchOperator(@Nullable String matchOperator) {
            this.matchOperator = matchOperator;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder upperBound(@Nullable Integer upperBound) {
            this.upperBound = upperBound;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public GetPropertyRulesBuilderRulesV20230530CriterionMatchResponseCode build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530CriterionMatchResponseCode();
            _resultValue.locked = locked;
            _resultValue.lowerBound = lowerBound;
            _resultValue.matchOperator = matchOperator;
            _resultValue.templateUuid = templateUuid;
            _resultValue.upperBound = upperBound;
            _resultValue.uuid = uuid;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
