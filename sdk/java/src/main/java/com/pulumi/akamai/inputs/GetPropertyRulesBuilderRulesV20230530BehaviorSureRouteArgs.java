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


public final class GetPropertyRulesBuilderRulesV20230530BehaviorSureRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorSureRouteArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorSureRouteArgs();

    @Import(name="allowFcmParentOverride")
    private @Nullable Output<Boolean> allowFcmParentOverride;

    public Optional<Output<Boolean>> allowFcmParentOverride() {
        return Optional.ofNullable(this.allowFcmParentOverride);
    }

    @Import(name="customMap")
    private @Nullable Output<String> customMap;

    public Optional<Output<String>> customMap() {
        return Optional.ofNullable(this.customMap);
    }

    @Import(name="customStatKey")
    private @Nullable Output<String> customStatKey;

    public Optional<Output<String>> customStatKey() {
        return Optional.ofNullable(this.customStatKey);
    }

    @Import(name="enableCustomKey")
    private @Nullable Output<Boolean> enableCustomKey;

    public Optional<Output<Boolean>> enableCustomKey() {
        return Optional.ofNullable(this.enableCustomKey);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="forceSslForward")
    private @Nullable Output<Boolean> forceSslForward;

    public Optional<Output<Boolean>> forceSslForward() {
        return Optional.ofNullable(this.forceSslForward);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="raceStatTtl")
    private @Nullable Output<String> raceStatTtl;

    public Optional<Output<String>> raceStatTtl() {
        return Optional.ofNullable(this.raceStatTtl);
    }

    @Import(name="srDownloadLinkTitle")
    private @Nullable Output<String> srDownloadLinkTitle;

    public Optional<Output<String>> srDownloadLinkTitle() {
        return Optional.ofNullable(this.srDownloadLinkTitle);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="testObjectUrl")
    private @Nullable Output<String> testObjectUrl;

    public Optional<Output<String>> testObjectUrl() {
        return Optional.ofNullable(this.testObjectUrl);
    }

    @Import(name="toHost")
    private @Nullable Output<String> toHost;

    public Optional<Output<String>> toHost() {
        return Optional.ofNullable(this.toHost);
    }

    @Import(name="toHostStatus")
    private @Nullable Output<String> toHostStatus;

    public Optional<Output<String>> toHostStatus() {
        return Optional.ofNullable(this.toHostStatus);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorSureRouteArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorSureRouteArgs(GetPropertyRulesBuilderRulesV20230530BehaviorSureRouteArgs $) {
        this.allowFcmParentOverride = $.allowFcmParentOverride;
        this.customMap = $.customMap;
        this.customStatKey = $.customStatKey;
        this.enableCustomKey = $.enableCustomKey;
        this.enabled = $.enabled;
        this.forceSslForward = $.forceSslForward;
        this.locked = $.locked;
        this.raceStatTtl = $.raceStatTtl;
        this.srDownloadLinkTitle = $.srDownloadLinkTitle;
        this.templateUuid = $.templateUuid;
        this.testObjectUrl = $.testObjectUrl;
        this.toHost = $.toHost;
        this.toHostStatus = $.toHostStatus;
        this.type = $.type;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorSureRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorSureRouteArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorSureRouteArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorSureRouteArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorSureRouteArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowFcmParentOverride(@Nullable Output<Boolean> allowFcmParentOverride) {
            $.allowFcmParentOverride = allowFcmParentOverride;
            return this;
        }

        public Builder allowFcmParentOverride(Boolean allowFcmParentOverride) {
            return allowFcmParentOverride(Output.of(allowFcmParentOverride));
        }

        public Builder customMap(@Nullable Output<String> customMap) {
            $.customMap = customMap;
            return this;
        }

        public Builder customMap(String customMap) {
            return customMap(Output.of(customMap));
        }

        public Builder customStatKey(@Nullable Output<String> customStatKey) {
            $.customStatKey = customStatKey;
            return this;
        }

        public Builder customStatKey(String customStatKey) {
            return customStatKey(Output.of(customStatKey));
        }

        public Builder enableCustomKey(@Nullable Output<Boolean> enableCustomKey) {
            $.enableCustomKey = enableCustomKey;
            return this;
        }

        public Builder enableCustomKey(Boolean enableCustomKey) {
            return enableCustomKey(Output.of(enableCustomKey));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder forceSslForward(@Nullable Output<Boolean> forceSslForward) {
            $.forceSslForward = forceSslForward;
            return this;
        }

        public Builder forceSslForward(Boolean forceSslForward) {
            return forceSslForward(Output.of(forceSslForward));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder raceStatTtl(@Nullable Output<String> raceStatTtl) {
            $.raceStatTtl = raceStatTtl;
            return this;
        }

        public Builder raceStatTtl(String raceStatTtl) {
            return raceStatTtl(Output.of(raceStatTtl));
        }

        public Builder srDownloadLinkTitle(@Nullable Output<String> srDownloadLinkTitle) {
            $.srDownloadLinkTitle = srDownloadLinkTitle;
            return this;
        }

        public Builder srDownloadLinkTitle(String srDownloadLinkTitle) {
            return srDownloadLinkTitle(Output.of(srDownloadLinkTitle));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder testObjectUrl(@Nullable Output<String> testObjectUrl) {
            $.testObjectUrl = testObjectUrl;
            return this;
        }

        public Builder testObjectUrl(String testObjectUrl) {
            return testObjectUrl(Output.of(testObjectUrl));
        }

        public Builder toHost(@Nullable Output<String> toHost) {
            $.toHost = toHost;
            return this;
        }

        public Builder toHost(String toHost) {
            return toHost(Output.of(toHost));
        }

        public Builder toHostStatus(@Nullable Output<String> toHostStatus) {
            $.toHostStatus = toHostStatus;
            return this;
        }

        public Builder toHostStatus(String toHostStatus) {
            return toHostStatus(Output.of(toHostStatus));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorSureRouteArgs build() {
            return $;
        }
    }

}