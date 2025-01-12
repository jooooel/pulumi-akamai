// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105CriterionQueryStringParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105CriterionQueryStringParameterArgs Empty = new GetPropertyRulesBuilderRulesV20230105CriterionQueryStringParameterArgs();

    @Import(name="escapeValue")
    private @Nullable Output<Boolean> escapeValue;

    public Optional<Output<Boolean>> escapeValue() {
        return Optional.ofNullable(this.escapeValue);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="lowerBound")
    private @Nullable Output<Integer> lowerBound;

    public Optional<Output<Integer>> lowerBound() {
        return Optional.ofNullable(this.lowerBound);
    }

    @Import(name="matchCaseSensitiveName")
    private @Nullable Output<Boolean> matchCaseSensitiveName;

    public Optional<Output<Boolean>> matchCaseSensitiveName() {
        return Optional.ofNullable(this.matchCaseSensitiveName);
    }

    @Import(name="matchCaseSensitiveValue")
    private @Nullable Output<Boolean> matchCaseSensitiveValue;

    public Optional<Output<Boolean>> matchCaseSensitiveValue() {
        return Optional.ofNullable(this.matchCaseSensitiveValue);
    }

    @Import(name="matchOperator")
    private @Nullable Output<String> matchOperator;

    public Optional<Output<String>> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }

    @Import(name="matchWildcardName")
    private @Nullable Output<Boolean> matchWildcardName;

    public Optional<Output<Boolean>> matchWildcardName() {
        return Optional.ofNullable(this.matchWildcardName);
    }

    @Import(name="matchWildcardValue")
    private @Nullable Output<Boolean> matchWildcardValue;

    public Optional<Output<Boolean>> matchWildcardValue() {
        return Optional.ofNullable(this.matchWildcardValue);
    }

    @Import(name="parameterName")
    private @Nullable Output<String> parameterName;

    public Optional<Output<String>> parameterName() {
        return Optional.ofNullable(this.parameterName);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="upperBound")
    private @Nullable Output<Integer> upperBound;

    public Optional<Output<Integer>> upperBound() {
        return Optional.ofNullable(this.upperBound);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private GetPropertyRulesBuilderRulesV20230105CriterionQueryStringParameterArgs() {}

    private GetPropertyRulesBuilderRulesV20230105CriterionQueryStringParameterArgs(GetPropertyRulesBuilderRulesV20230105CriterionQueryStringParameterArgs $) {
        this.escapeValue = $.escapeValue;
        this.locked = $.locked;
        this.lowerBound = $.lowerBound;
        this.matchCaseSensitiveName = $.matchCaseSensitiveName;
        this.matchCaseSensitiveValue = $.matchCaseSensitiveValue;
        this.matchOperator = $.matchOperator;
        this.matchWildcardName = $.matchWildcardName;
        this.matchWildcardValue = $.matchWildcardValue;
        this.parameterName = $.parameterName;
        this.templateUuid = $.templateUuid;
        this.upperBound = $.upperBound;
        this.uuid = $.uuid;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionQueryStringParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105CriterionQueryStringParameterArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionQueryStringParameterArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionQueryStringParameterArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionQueryStringParameterArgs(Objects.requireNonNull(defaults));
        }

        public Builder escapeValue(@Nullable Output<Boolean> escapeValue) {
            $.escapeValue = escapeValue;
            return this;
        }

        public Builder escapeValue(Boolean escapeValue) {
            return escapeValue(Output.of(escapeValue));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder lowerBound(@Nullable Output<Integer> lowerBound) {
            $.lowerBound = lowerBound;
            return this;
        }

        public Builder lowerBound(Integer lowerBound) {
            return lowerBound(Output.of(lowerBound));
        }

        public Builder matchCaseSensitiveName(@Nullable Output<Boolean> matchCaseSensitiveName) {
            $.matchCaseSensitiveName = matchCaseSensitiveName;
            return this;
        }

        public Builder matchCaseSensitiveName(Boolean matchCaseSensitiveName) {
            return matchCaseSensitiveName(Output.of(matchCaseSensitiveName));
        }

        public Builder matchCaseSensitiveValue(@Nullable Output<Boolean> matchCaseSensitiveValue) {
            $.matchCaseSensitiveValue = matchCaseSensitiveValue;
            return this;
        }

        public Builder matchCaseSensitiveValue(Boolean matchCaseSensitiveValue) {
            return matchCaseSensitiveValue(Output.of(matchCaseSensitiveValue));
        }

        public Builder matchOperator(@Nullable Output<String> matchOperator) {
            $.matchOperator = matchOperator;
            return this;
        }

        public Builder matchOperator(String matchOperator) {
            return matchOperator(Output.of(matchOperator));
        }

        public Builder matchWildcardName(@Nullable Output<Boolean> matchWildcardName) {
            $.matchWildcardName = matchWildcardName;
            return this;
        }

        public Builder matchWildcardName(Boolean matchWildcardName) {
            return matchWildcardName(Output.of(matchWildcardName));
        }

        public Builder matchWildcardValue(@Nullable Output<Boolean> matchWildcardValue) {
            $.matchWildcardValue = matchWildcardValue;
            return this;
        }

        public Builder matchWildcardValue(Boolean matchWildcardValue) {
            return matchWildcardValue(Output.of(matchWildcardValue));
        }

        public Builder parameterName(@Nullable Output<String> parameterName) {
            $.parameterName = parameterName;
            return this;
        }

        public Builder parameterName(String parameterName) {
            return parameterName(Output.of(parameterName));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder upperBound(@Nullable Output<Integer> upperBound) {
            $.upperBound = upperBound;
            return this;
        }

        public Builder upperBound(Integer upperBound) {
            return upperBound(Output.of(upperBound));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetPropertyRulesBuilderRulesV20230105CriterionQueryStringParameterArgs build() {
            return $;
        }
    }

}
