// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorPhasedReleaseCloudletPolicy;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorPhasedRelease extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorPhasedRelease Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorPhasedRelease();

    @Import(name="cloudletPolicy")
    private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorPhasedReleaseCloudletPolicy cloudletPolicy;

    public Optional<GetPropertyRulesBuilderRulesV20230105BehaviorPhasedReleaseCloudletPolicy> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="failoverDuration")
    private @Nullable Integer failoverDuration;

    public Optional<Integer> failoverDuration() {
        return Optional.ofNullable(this.failoverDuration);
    }

    @Import(name="failoverEnabled")
    private @Nullable Boolean failoverEnabled;

    public Optional<Boolean> failoverEnabled() {
        return Optional.ofNullable(this.failoverEnabled);
    }

    @Import(name="failoverResponseCodes")
    private @Nullable List<String> failoverResponseCodes;

    public Optional<List<String>> failoverResponseCodes() {
        return Optional.ofNullable(this.failoverResponseCodes);
    }

    @Import(name="failoverTitle")
    private @Nullable String failoverTitle;

    public Optional<String> failoverTitle() {
        return Optional.ofNullable(this.failoverTitle);
    }

    @Import(name="label")
    private @Nullable String label;

    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="populationCookieType")
    private @Nullable String populationCookieType;

    public Optional<String> populationCookieType() {
        return Optional.ofNullable(this.populationCookieType);
    }

    @Import(name="populationDuration")
    private @Nullable String populationDuration;

    public Optional<String> populationDuration() {
        return Optional.ofNullable(this.populationDuration);
    }

    @Import(name="populationExpirationDate")
    private @Nullable String populationExpirationDate;

    public Optional<String> populationExpirationDate() {
        return Optional.ofNullable(this.populationExpirationDate);
    }

    @Import(name="populationRefresh")
    private @Nullable Boolean populationRefresh;

    public Optional<Boolean> populationRefresh() {
        return Optional.ofNullable(this.populationRefresh);
    }

    @Import(name="populationTitle")
    private @Nullable String populationTitle;

    public Optional<String> populationTitle() {
        return Optional.ofNullable(this.populationTitle);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorPhasedRelease() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorPhasedRelease(GetPropertyRulesBuilderRulesV20230105BehaviorPhasedRelease $) {
        this.cloudletPolicy = $.cloudletPolicy;
        this.enabled = $.enabled;
        this.failoverDuration = $.failoverDuration;
        this.failoverEnabled = $.failoverEnabled;
        this.failoverResponseCodes = $.failoverResponseCodes;
        this.failoverTitle = $.failoverTitle;
        this.label = $.label;
        this.locked = $.locked;
        this.populationCookieType = $.populationCookieType;
        this.populationDuration = $.populationDuration;
        this.populationExpirationDate = $.populationExpirationDate;
        this.populationRefresh = $.populationRefresh;
        this.populationTitle = $.populationTitle;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorPhasedRelease defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorPhasedRelease $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorPhasedRelease();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorPhasedRelease defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorPhasedRelease(Objects.requireNonNull(defaults));
        }

        public Builder cloudletPolicy(@Nullable GetPropertyRulesBuilderRulesV20230105BehaviorPhasedReleaseCloudletPolicy cloudletPolicy) {
            $.cloudletPolicy = cloudletPolicy;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder failoverDuration(@Nullable Integer failoverDuration) {
            $.failoverDuration = failoverDuration;
            return this;
        }

        public Builder failoverEnabled(@Nullable Boolean failoverEnabled) {
            $.failoverEnabled = failoverEnabled;
            return this;
        }

        public Builder failoverResponseCodes(@Nullable List<String> failoverResponseCodes) {
            $.failoverResponseCodes = failoverResponseCodes;
            return this;
        }

        public Builder failoverResponseCodes(String... failoverResponseCodes) {
            return failoverResponseCodes(List.of(failoverResponseCodes));
        }

        public Builder failoverTitle(@Nullable String failoverTitle) {
            $.failoverTitle = failoverTitle;
            return this;
        }

        public Builder label(@Nullable String label) {
            $.label = label;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder populationCookieType(@Nullable String populationCookieType) {
            $.populationCookieType = populationCookieType;
            return this;
        }

        public Builder populationDuration(@Nullable String populationDuration) {
            $.populationDuration = populationDuration;
            return this;
        }

        public Builder populationExpirationDate(@Nullable String populationExpirationDate) {
            $.populationExpirationDate = populationExpirationDate;
            return this;
        }

        public Builder populationRefresh(@Nullable Boolean populationRefresh) {
            $.populationRefresh = populationRefresh;
            return this;
        }

        public Builder populationTitle(@Nullable String populationTitle) {
            $.populationTitle = populationTitle;
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorPhasedRelease build() {
            return $;
        }
    }

}