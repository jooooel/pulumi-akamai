// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorDatastream extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorDatastream Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorDatastream();

    @Import(name="beaconStreamTitle")
    private @Nullable String beaconStreamTitle;

    public Optional<String> beaconStreamTitle() {
        return Optional.ofNullable(this.beaconStreamTitle);
    }

    @Import(name="collectMidgressTraffic")
    private @Nullable Boolean collectMidgressTraffic;

    public Optional<Boolean> collectMidgressTraffic() {
        return Optional.ofNullable(this.collectMidgressTraffic);
    }

    @Import(name="datastreamIds")
    private @Nullable String datastreamIds;

    public Optional<String> datastreamIds() {
        return Optional.ofNullable(this.datastreamIds);
    }

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="logEnabled")
    private @Nullable Boolean logEnabled;

    public Optional<Boolean> logEnabled() {
        return Optional.ofNullable(this.logEnabled);
    }

    @Import(name="logStreamNames")
    private @Nullable List<String> logStreamNames;

    public Optional<List<String>> logStreamNames() {
        return Optional.ofNullable(this.logStreamNames);
    }

    @Import(name="logStreamTitle")
    private @Nullable String logStreamTitle;

    public Optional<String> logStreamTitle() {
        return Optional.ofNullable(this.logStreamTitle);
    }

    @Import(name="samplingPercentage")
    private @Nullable Integer samplingPercentage;

    public Optional<Integer> samplingPercentage() {
        return Optional.ofNullable(this.samplingPercentage);
    }

    @Import(name="streamType")
    private @Nullable String streamType;

    public Optional<String> streamType() {
        return Optional.ofNullable(this.streamType);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorDatastream() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorDatastream(GetPropertyRulesBuilderRulesV20230530BehaviorDatastream $) {
        this.beaconStreamTitle = $.beaconStreamTitle;
        this.collectMidgressTraffic = $.collectMidgressTraffic;
        this.datastreamIds = $.datastreamIds;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.logEnabled = $.logEnabled;
        this.logStreamNames = $.logStreamNames;
        this.logStreamTitle = $.logStreamTitle;
        this.samplingPercentage = $.samplingPercentage;
        this.streamType = $.streamType;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorDatastream defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorDatastream $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorDatastream();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorDatastream defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorDatastream(Objects.requireNonNull(defaults));
        }

        public Builder beaconStreamTitle(@Nullable String beaconStreamTitle) {
            $.beaconStreamTitle = beaconStreamTitle;
            return this;
        }

        public Builder collectMidgressTraffic(@Nullable Boolean collectMidgressTraffic) {
            $.collectMidgressTraffic = collectMidgressTraffic;
            return this;
        }

        public Builder datastreamIds(@Nullable String datastreamIds) {
            $.datastreamIds = datastreamIds;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder logEnabled(@Nullable Boolean logEnabled) {
            $.logEnabled = logEnabled;
            return this;
        }

        public Builder logStreamNames(@Nullable List<String> logStreamNames) {
            $.logStreamNames = logStreamNames;
            return this;
        }

        public Builder logStreamNames(String... logStreamNames) {
            return logStreamNames(List.of(logStreamNames));
        }

        public Builder logStreamTitle(@Nullable String logStreamTitle) {
            $.logStreamTitle = logStreamTitle;
            return this;
        }

        public Builder samplingPercentage(@Nullable Integer samplingPercentage) {
            $.samplingPercentage = samplingPercentage;
            return this;
        }

        public Builder streamType(@Nullable String streamType) {
            $.streamType = streamType;
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorDatastream build() {
            return $;
        }
    }

}
