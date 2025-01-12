// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorScheduleInvalidationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorScheduleInvalidationArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorScheduleInvalidationArgs();

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="refreshMethod")
    private @Nullable Output<String> refreshMethod;

    public Optional<Output<String>> refreshMethod() {
        return Optional.ofNullable(this.refreshMethod);
    }

    @Import(name="repeat")
    private @Nullable Output<Boolean> repeat;

    public Optional<Output<Boolean>> repeat() {
        return Optional.ofNullable(this.repeat);
    }

    @Import(name="repeatInterval")
    private @Nullable Output<String> repeatInterval;

    public Optional<Output<String>> repeatInterval() {
        return Optional.ofNullable(this.repeatInterval);
    }

    @Import(name="start")
    private @Nullable Output<String> start;

    public Optional<Output<String>> start() {
        return Optional.ofNullable(this.start);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorScheduleInvalidationArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorScheduleInvalidationArgs(GetPropertyRulesBuilderRulesV20230530BehaviorScheduleInvalidationArgs $) {
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
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorScheduleInvalidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorScheduleInvalidationArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorScheduleInvalidationArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorScheduleInvalidationArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorScheduleInvalidationArgs(Objects.requireNonNull(defaults));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder refreshMethod(@Nullable Output<String> refreshMethod) {
            $.refreshMethod = refreshMethod;
            return this;
        }

        public Builder refreshMethod(String refreshMethod) {
            return refreshMethod(Output.of(refreshMethod));
        }

        public Builder repeat(@Nullable Output<Boolean> repeat) {
            $.repeat = repeat;
            return this;
        }

        public Builder repeat(Boolean repeat) {
            return repeat(Output.of(repeat));
        }

        public Builder repeatInterval(@Nullable Output<String> repeatInterval) {
            $.repeatInterval = repeatInterval;
            return this;
        }

        public Builder repeatInterval(String repeatInterval) {
            return repeatInterval(Output.of(repeatInterval));
        }

        public Builder start(@Nullable Output<String> start) {
            $.start = start;
            return this;
        }

        public Builder start(String start) {
            return start(Output.of(start));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorScheduleInvalidationArgs build() {
            return $;
        }
    }

}
