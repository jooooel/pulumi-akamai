// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530CriterionVariableError {
    private @Nullable Boolean locked;
    private @Nullable Boolean result;
    private @Nullable String templateUuid;
    private @Nullable String uuid;
    private @Nullable List<String> variableNames;

    private GetPropertyRulesBuilderRulesV20230530CriterionVariableError() {}
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<Boolean> result() {
        return Optional.ofNullable(this.result);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public List<String> variableNames() {
        return this.variableNames == null ? List.of() : this.variableNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530CriterionVariableError defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean locked;
        private @Nullable Boolean result;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        private @Nullable List<String> variableNames;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530CriterionVariableError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
    	      this.result = defaults.result;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
    	      this.variableNames = defaults.variableNames;
        }

        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder result(@Nullable Boolean result) {
            this.result = result;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder variableNames(@Nullable List<String> variableNames) {
            this.variableNames = variableNames;
            return this;
        }
        public Builder variableNames(String... variableNames) {
            return variableNames(List.of(variableNames));
        }
        public GetPropertyRulesBuilderRulesV20230530CriterionVariableError build() {
            final var o = new GetPropertyRulesBuilderRulesV20230530CriterionVariableError();
            o.locked = locked;
            o.result = result;
            o.templateUuid = templateUuid;
            o.uuid = uuid;
            o.variableNames = variableNames;
            return o;
        }
    }
}