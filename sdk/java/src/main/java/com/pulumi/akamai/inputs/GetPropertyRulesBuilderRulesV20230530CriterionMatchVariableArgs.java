// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530CriterionMatchVariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530CriterionMatchVariableArgs Empty = new GetPropertyRulesBuilderRulesV20230530CriterionMatchVariableArgs();

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="lowerBound")
    private @Nullable Output<String> lowerBound;

    public Optional<Output<String>> lowerBound() {
        return Optional.ofNullable(this.lowerBound);
    }

    @Import(name="matchCaseSensitive")
    private @Nullable Output<Boolean> matchCaseSensitive;

    public Optional<Output<Boolean>> matchCaseSensitive() {
        return Optional.ofNullable(this.matchCaseSensitive);
    }

    @Import(name="matchOperator")
    private @Nullable Output<String> matchOperator;

    public Optional<Output<String>> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }

    @Import(name="matchWildcard")
    private @Nullable Output<Boolean> matchWildcard;

    public Optional<Output<Boolean>> matchWildcard() {
        return Optional.ofNullable(this.matchWildcard);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="upperBound")
    private @Nullable Output<String> upperBound;

    public Optional<Output<String>> upperBound() {
        return Optional.ofNullable(this.upperBound);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    @Import(name="variableExpression")
    private @Nullable Output<String> variableExpression;

    public Optional<Output<String>> variableExpression() {
        return Optional.ofNullable(this.variableExpression);
    }

    @Import(name="variableName")
    private @Nullable Output<String> variableName;

    public Optional<Output<String>> variableName() {
        return Optional.ofNullable(this.variableName);
    }

    @Import(name="variableValues")
    private @Nullable Output<List<String>> variableValues;

    public Optional<Output<List<String>>> variableValues() {
        return Optional.ofNullable(this.variableValues);
    }

    private GetPropertyRulesBuilderRulesV20230530CriterionMatchVariableArgs() {}

    private GetPropertyRulesBuilderRulesV20230530CriterionMatchVariableArgs(GetPropertyRulesBuilderRulesV20230530CriterionMatchVariableArgs $) {
        this.locked = $.locked;
        this.lowerBound = $.lowerBound;
        this.matchCaseSensitive = $.matchCaseSensitive;
        this.matchOperator = $.matchOperator;
        this.matchWildcard = $.matchWildcard;
        this.templateUuid = $.templateUuid;
        this.upperBound = $.upperBound;
        this.uuid = $.uuid;
        this.variableExpression = $.variableExpression;
        this.variableName = $.variableName;
        this.variableValues = $.variableValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530CriterionMatchVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530CriterionMatchVariableArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionMatchVariableArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530CriterionMatchVariableArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionMatchVariableArgs(Objects.requireNonNull(defaults));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder lowerBound(@Nullable Output<String> lowerBound) {
            $.lowerBound = lowerBound;
            return this;
        }

        public Builder lowerBound(String lowerBound) {
            return lowerBound(Output.of(lowerBound));
        }

        public Builder matchCaseSensitive(@Nullable Output<Boolean> matchCaseSensitive) {
            $.matchCaseSensitive = matchCaseSensitive;
            return this;
        }

        public Builder matchCaseSensitive(Boolean matchCaseSensitive) {
            return matchCaseSensitive(Output.of(matchCaseSensitive));
        }

        public Builder matchOperator(@Nullable Output<String> matchOperator) {
            $.matchOperator = matchOperator;
            return this;
        }

        public Builder matchOperator(String matchOperator) {
            return matchOperator(Output.of(matchOperator));
        }

        public Builder matchWildcard(@Nullable Output<Boolean> matchWildcard) {
            $.matchWildcard = matchWildcard;
            return this;
        }

        public Builder matchWildcard(Boolean matchWildcard) {
            return matchWildcard(Output.of(matchWildcard));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder upperBound(@Nullable Output<String> upperBound) {
            $.upperBound = upperBound;
            return this;
        }

        public Builder upperBound(String upperBound) {
            return upperBound(Output.of(upperBound));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public Builder variableExpression(@Nullable Output<String> variableExpression) {
            $.variableExpression = variableExpression;
            return this;
        }

        public Builder variableExpression(String variableExpression) {
            return variableExpression(Output.of(variableExpression));
        }

        public Builder variableName(@Nullable Output<String> variableName) {
            $.variableName = variableName;
            return this;
        }

        public Builder variableName(String variableName) {
            return variableName(Output.of(variableName));
        }

        public Builder variableValues(@Nullable Output<List<String>> variableValues) {
            $.variableValues = variableValues;
            return this;
        }

        public Builder variableValues(List<String> variableValues) {
            return variableValues(Output.of(variableValues));
        }

        public Builder variableValues(String... variableValues) {
            return variableValues(List.of(variableValues));
        }

        public GetPropertyRulesBuilderRulesV20230530CriterionMatchVariableArgs build() {
            return $;
        }
    }

}
