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


public final class GetPropertyRulesBuilderRulesV20230530CriterionRequestHeader extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530CriterionRequestHeader Empty = new GetPropertyRulesBuilderRulesV20230530CriterionRequestHeader();

    @Import(name="headerName")
    private @Nullable String headerName;

    public Optional<String> headerName() {
        return Optional.ofNullable(this.headerName);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="matchCaseSensitiveValue")
    private @Nullable Boolean matchCaseSensitiveValue;

    public Optional<Boolean> matchCaseSensitiveValue() {
        return Optional.ofNullable(this.matchCaseSensitiveValue);
    }

    @Import(name="matchOperator")
    private @Nullable String matchOperator;

    public Optional<String> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }

    @Import(name="matchWildcardName")
    private @Nullable Boolean matchWildcardName;

    public Optional<Boolean> matchWildcardName() {
        return Optional.ofNullable(this.matchWildcardName);
    }

    @Import(name="matchWildcardValue")
    private @Nullable Boolean matchWildcardValue;

    public Optional<Boolean> matchWildcardValue() {
        return Optional.ofNullable(this.matchWildcardValue);
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

    @Import(name="values")
    private @Nullable List<String> values;

    public Optional<List<String>> values() {
        return Optional.ofNullable(this.values);
    }

    private GetPropertyRulesBuilderRulesV20230530CriterionRequestHeader() {}

    private GetPropertyRulesBuilderRulesV20230530CriterionRequestHeader(GetPropertyRulesBuilderRulesV20230530CriterionRequestHeader $) {
        this.headerName = $.headerName;
        this.locked = $.locked;
        this.matchCaseSensitiveValue = $.matchCaseSensitiveValue;
        this.matchOperator = $.matchOperator;
        this.matchWildcardName = $.matchWildcardName;
        this.matchWildcardValue = $.matchWildcardValue;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530CriterionRequestHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530CriterionRequestHeader $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionRequestHeader();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530CriterionRequestHeader defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionRequestHeader(Objects.requireNonNull(defaults));
        }

        public Builder headerName(@Nullable String headerName) {
            $.headerName = headerName;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder matchCaseSensitiveValue(@Nullable Boolean matchCaseSensitiveValue) {
            $.matchCaseSensitiveValue = matchCaseSensitiveValue;
            return this;
        }

        public Builder matchOperator(@Nullable String matchOperator) {
            $.matchOperator = matchOperator;
            return this;
        }

        public Builder matchWildcardName(@Nullable Boolean matchWildcardName) {
            $.matchWildcardName = matchWildcardName;
            return this;
        }

        public Builder matchWildcardValue(@Nullable Boolean matchWildcardValue) {
            $.matchWildcardValue = matchWildcardValue;
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

        public Builder values(@Nullable List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetPropertyRulesBuilderRulesV20230530CriterionRequestHeader build() {
            return $;
        }
    }

}
