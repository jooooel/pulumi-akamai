// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105CriterionRegularExpression extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105CriterionRegularExpression Empty = new GetPropertyRulesBuilderRulesV20230105CriterionRegularExpression();

    @Import(name="caseSensitive")
    private @Nullable Boolean caseSensitive;

    public Optional<Boolean> caseSensitive() {
        return Optional.ofNullable(this.caseSensitive);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="matchString")
    private @Nullable String matchString;

    public Optional<String> matchString() {
        return Optional.ofNullable(this.matchString);
    }

    @Import(name="regex")
    private @Nullable String regex;

    public Optional<String> regex() {
        return Optional.ofNullable(this.regex);
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

    private GetPropertyRulesBuilderRulesV20230105CriterionRegularExpression() {}

    private GetPropertyRulesBuilderRulesV20230105CriterionRegularExpression(GetPropertyRulesBuilderRulesV20230105CriterionRegularExpression $) {
        this.caseSensitive = $.caseSensitive;
        this.locked = $.locked;
        this.matchString = $.matchString;
        this.regex = $.regex;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionRegularExpression defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105CriterionRegularExpression $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionRegularExpression();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionRegularExpression defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionRegularExpression(Objects.requireNonNull(defaults));
        }

        public Builder caseSensitive(@Nullable Boolean caseSensitive) {
            $.caseSensitive = caseSensitive;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder matchString(@Nullable String matchString) {
            $.matchString = matchString;
            return this;
        }

        public Builder regex(@Nullable String regex) {
            $.regex = regex;
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

        public GetPropertyRulesBuilderRulesV20230105CriterionRegularExpression build() {
            return $;
        }
    }

}