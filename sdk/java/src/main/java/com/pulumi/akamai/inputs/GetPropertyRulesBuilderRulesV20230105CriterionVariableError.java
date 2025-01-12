// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105CriterionVariableError extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105CriterionVariableError Empty = new GetPropertyRulesBuilderRulesV20230105CriterionVariableError();

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="result")
    private @Nullable Boolean result;

    public Optional<Boolean> result() {
        return Optional.ofNullable(this.result);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    @Import(name="variableNames")
    private @Nullable List<String> variableNames;

    public Optional<List<String>> variableNames() {
        return Optional.ofNullable(this.variableNames);
    }

    private GetPropertyRulesBuilderRulesV20230105CriterionVariableError() {}

    private GetPropertyRulesBuilderRulesV20230105CriterionVariableError(GetPropertyRulesBuilderRulesV20230105CriterionVariableError $) {
        this.locked = $.locked;
        this.result = $.result;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
        this.variableNames = $.variableNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionVariableError defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105CriterionVariableError $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionVariableError();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionVariableError defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionVariableError(Objects.requireNonNull(defaults));
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder result(@Nullable Boolean result) {
            $.result = result;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder variableNames(@Nullable List<String> variableNames) {
            $.variableNames = variableNames;
            return this;
        }

        public Builder variableNames(String... variableNames) {
            return variableNames(List.of(variableNames));
        }

        public GetPropertyRulesBuilderRulesV20230105CriterionVariableError build() {
            return $;
        }
    }

}
