// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorScheduleInvalidation extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorScheduleInvalidation Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorScheduleInvalidation();

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="refreshMethod")
    private @Nullable String refreshMethod;

    public Optional<String> refreshMethod() {
        return Optional.ofNullable(this.refreshMethod);
    }

    @Import(name="repeat")
    private @Nullable Boolean repeat;

    public Optional<Boolean> repeat() {
        return Optional.ofNullable(this.repeat);
    }

    @Import(name="repeatInterval")
    private @Nullable String repeatInterval;

    public Optional<String> repeatInterval() {
        return Optional.ofNullable(this.repeatInterval);
    }

    @Import(name="start")
    private @Nullable String start;

    public Optional<String> start() {
        return Optional.ofNullable(this.start);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorScheduleInvalidation() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorScheduleInvalidation(GetPropertyRulesBuilderRulesV20230105BehaviorScheduleInvalidation $) {
        this.locked = $.locked;
        this.refreshMethod = $.refreshMethod;
        this.repeat = $.repeat;
        this.repeatInterval = $.repeatInterval;
        this.start = $.start;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorScheduleInvalidation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorScheduleInvalidation $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorScheduleInvalidation();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorScheduleInvalidation defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorScheduleInvalidation(Objects.requireNonNull(defaults));
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder refreshMethod(@Nullable String refreshMethod) {
            $.refreshMethod = refreshMethod;
            return this;
        }

        public Builder repeat(@Nullable Boolean repeat) {
            $.repeat = repeat;
            return this;
        }

        public Builder repeatInterval(@Nullable String repeatInterval) {
            $.repeatInterval = repeatInterval;
            return this;
        }

        public Builder start(@Nullable String start) {
            $.start = start;
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorScheduleInvalidation build() {
            return $;
        }
    }

}