// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530CriterionTime extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530CriterionTime Empty = new GetPropertyRulesBuilderRulesV20230530CriterionTime();

    @Import(name="applyDaylightSavingsTime")
    private @Nullable Boolean applyDaylightSavingsTime;

    public Optional<Boolean> applyDaylightSavingsTime() {
        return Optional.ofNullable(this.applyDaylightSavingsTime);
    }

    @Import(name="beginDate")
    private @Nullable String beginDate;

    public Optional<String> beginDate() {
        return Optional.ofNullable(this.beginDate);
    }

    @Import(name="endDate")
    private @Nullable String endDate;

    public Optional<String> endDate() {
        return Optional.ofNullable(this.endDate);
    }

    @Import(name="lastingDate")
    private @Nullable String lastingDate;

    public Optional<String> lastingDate() {
        return Optional.ofNullable(this.lastingDate);
    }

    @Import(name="lastingDuration")
    private @Nullable String lastingDuration;

    public Optional<String> lastingDuration() {
        return Optional.ofNullable(this.lastingDuration);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="matchOperator")
    private @Nullable String matchOperator;

    public Optional<String> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }

    @Import(name="repeatBeginDate")
    private @Nullable String repeatBeginDate;

    public Optional<String> repeatBeginDate() {
        return Optional.ofNullable(this.repeatBeginDate);
    }

    @Import(name="repeatDuration")
    private @Nullable String repeatDuration;

    public Optional<String> repeatDuration() {
        return Optional.ofNullable(this.repeatDuration);
    }

    @Import(name="repeatInterval")
    private @Nullable String repeatInterval;

    public Optional<String> repeatInterval() {
        return Optional.ofNullable(this.repeatInterval);
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

    private GetPropertyRulesBuilderRulesV20230530CriterionTime() {}

    private GetPropertyRulesBuilderRulesV20230530CriterionTime(GetPropertyRulesBuilderRulesV20230530CriterionTime $) {
        this.applyDaylightSavingsTime = $.applyDaylightSavingsTime;
        this.beginDate = $.beginDate;
        this.endDate = $.endDate;
        this.lastingDate = $.lastingDate;
        this.lastingDuration = $.lastingDuration;
        this.locked = $.locked;
        this.matchOperator = $.matchOperator;
        this.repeatBeginDate = $.repeatBeginDate;
        this.repeatDuration = $.repeatDuration;
        this.repeatInterval = $.repeatInterval;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530CriterionTime defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530CriterionTime $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionTime();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530CriterionTime defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionTime(Objects.requireNonNull(defaults));
        }

        public Builder applyDaylightSavingsTime(@Nullable Boolean applyDaylightSavingsTime) {
            $.applyDaylightSavingsTime = applyDaylightSavingsTime;
            return this;
        }

        public Builder beginDate(@Nullable String beginDate) {
            $.beginDate = beginDate;
            return this;
        }

        public Builder endDate(@Nullable String endDate) {
            $.endDate = endDate;
            return this;
        }

        public Builder lastingDate(@Nullable String lastingDate) {
            $.lastingDate = lastingDate;
            return this;
        }

        public Builder lastingDuration(@Nullable String lastingDuration) {
            $.lastingDuration = lastingDuration;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder matchOperator(@Nullable String matchOperator) {
            $.matchOperator = matchOperator;
            return this;
        }

        public Builder repeatBeginDate(@Nullable String repeatBeginDate) {
            $.repeatBeginDate = repeatBeginDate;
            return this;
        }

        public Builder repeatDuration(@Nullable String repeatDuration) {
            $.repeatDuration = repeatDuration;
            return this;
        }

        public Builder repeatInterval(@Nullable String repeatInterval) {
            $.repeatInterval = repeatInterval;
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

        public GetPropertyRulesBuilderRulesV20230530CriterionTime build() {
            return $;
        }
    }

}