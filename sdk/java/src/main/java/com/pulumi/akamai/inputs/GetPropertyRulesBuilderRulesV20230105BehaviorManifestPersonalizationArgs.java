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


public final class GetPropertyRulesBuilderRulesV20230105BehaviorManifestPersonalizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorManifestPersonalizationArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorManifestPersonalizationArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="hlsEnableDebugHeaders")
    private @Nullable Output<Boolean> hlsEnableDebugHeaders;

    public Optional<Output<Boolean>> hlsEnableDebugHeaders() {
        return Optional.ofNullable(this.hlsEnableDebugHeaders);
    }

    @Import(name="hlsEnabled")
    private @Nullable Output<Boolean> hlsEnabled;

    public Optional<Output<Boolean>> hlsEnabled() {
        return Optional.ofNullable(this.hlsEnabled);
    }

    @Import(name="hlsFilterInBitrateRanges")
    private @Nullable Output<String> hlsFilterInBitrateRanges;

    public Optional<Output<String>> hlsFilterInBitrateRanges() {
        return Optional.ofNullable(this.hlsFilterInBitrateRanges);
    }

    @Import(name="hlsFilterInBitrates")
    private @Nullable Output<String> hlsFilterInBitrates;

    public Optional<Output<String>> hlsFilterInBitrates() {
        return Optional.ofNullable(this.hlsFilterInBitrates);
    }

    @Import(name="hlsMode")
    private @Nullable Output<String> hlsMode;

    public Optional<Output<String>> hlsMode() {
        return Optional.ofNullable(this.hlsMode);
    }

    @Import(name="hlsPreferredBitrate")
    private @Nullable Output<String> hlsPreferredBitrate;

    public Optional<Output<String>> hlsPreferredBitrate() {
        return Optional.ofNullable(this.hlsPreferredBitrate);
    }

    @Import(name="hlsQueryParamEnabled")
    private @Nullable Output<Boolean> hlsQueryParamEnabled;

    public Optional<Output<Boolean>> hlsQueryParamEnabled() {
        return Optional.ofNullable(this.hlsQueryParamEnabled);
    }

    @Import(name="hlsQueryParamSecretKey")
    private @Nullable Output<String> hlsQueryParamSecretKey;

    public Optional<Output<String>> hlsQueryParamSecretKey() {
        return Optional.ofNullable(this.hlsQueryParamSecretKey);
    }

    @Import(name="hlsQueryParamTransitionKey")
    private @Nullable Output<String> hlsQueryParamTransitionKey;

    public Optional<Output<String>> hlsQueryParamTransitionKey() {
        return Optional.ofNullable(this.hlsQueryParamTransitionKey);
    }

    @Import(name="hlsShowAdvanced")
    private @Nullable Output<Boolean> hlsShowAdvanced;

    public Optional<Output<Boolean>> hlsShowAdvanced() {
        return Optional.ofNullable(this.hlsShowAdvanced);
    }

    @Import(name="hlsTitle")
    private @Nullable Output<String> hlsTitle;

    public Optional<Output<String>> hlsTitle() {
        return Optional.ofNullable(this.hlsTitle);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorManifestPersonalizationArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorManifestPersonalizationArgs(GetPropertyRulesBuilderRulesV20230105BehaviorManifestPersonalizationArgs $) {
        this.enabled = $.enabled;
        this.hlsEnableDebugHeaders = $.hlsEnableDebugHeaders;
        this.hlsEnabled = $.hlsEnabled;
        this.hlsFilterInBitrateRanges = $.hlsFilterInBitrateRanges;
        this.hlsFilterInBitrates = $.hlsFilterInBitrates;
        this.hlsMode = $.hlsMode;
        this.hlsPreferredBitrate = $.hlsPreferredBitrate;
        this.hlsQueryParamEnabled = $.hlsQueryParamEnabled;
        this.hlsQueryParamSecretKey = $.hlsQueryParamSecretKey;
        this.hlsQueryParamTransitionKey = $.hlsQueryParamTransitionKey;
        this.hlsShowAdvanced = $.hlsShowAdvanced;
        this.hlsTitle = $.hlsTitle;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorManifestPersonalizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorManifestPersonalizationArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorManifestPersonalizationArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorManifestPersonalizationArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorManifestPersonalizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder hlsEnableDebugHeaders(@Nullable Output<Boolean> hlsEnableDebugHeaders) {
            $.hlsEnableDebugHeaders = hlsEnableDebugHeaders;
            return this;
        }

        public Builder hlsEnableDebugHeaders(Boolean hlsEnableDebugHeaders) {
            return hlsEnableDebugHeaders(Output.of(hlsEnableDebugHeaders));
        }

        public Builder hlsEnabled(@Nullable Output<Boolean> hlsEnabled) {
            $.hlsEnabled = hlsEnabled;
            return this;
        }

        public Builder hlsEnabled(Boolean hlsEnabled) {
            return hlsEnabled(Output.of(hlsEnabled));
        }

        public Builder hlsFilterInBitrateRanges(@Nullable Output<String> hlsFilterInBitrateRanges) {
            $.hlsFilterInBitrateRanges = hlsFilterInBitrateRanges;
            return this;
        }

        public Builder hlsFilterInBitrateRanges(String hlsFilterInBitrateRanges) {
            return hlsFilterInBitrateRanges(Output.of(hlsFilterInBitrateRanges));
        }

        public Builder hlsFilterInBitrates(@Nullable Output<String> hlsFilterInBitrates) {
            $.hlsFilterInBitrates = hlsFilterInBitrates;
            return this;
        }

        public Builder hlsFilterInBitrates(String hlsFilterInBitrates) {
            return hlsFilterInBitrates(Output.of(hlsFilterInBitrates));
        }

        public Builder hlsMode(@Nullable Output<String> hlsMode) {
            $.hlsMode = hlsMode;
            return this;
        }

        public Builder hlsMode(String hlsMode) {
            return hlsMode(Output.of(hlsMode));
        }

        public Builder hlsPreferredBitrate(@Nullable Output<String> hlsPreferredBitrate) {
            $.hlsPreferredBitrate = hlsPreferredBitrate;
            return this;
        }

        public Builder hlsPreferredBitrate(String hlsPreferredBitrate) {
            return hlsPreferredBitrate(Output.of(hlsPreferredBitrate));
        }

        public Builder hlsQueryParamEnabled(@Nullable Output<Boolean> hlsQueryParamEnabled) {
            $.hlsQueryParamEnabled = hlsQueryParamEnabled;
            return this;
        }

        public Builder hlsQueryParamEnabled(Boolean hlsQueryParamEnabled) {
            return hlsQueryParamEnabled(Output.of(hlsQueryParamEnabled));
        }

        public Builder hlsQueryParamSecretKey(@Nullable Output<String> hlsQueryParamSecretKey) {
            $.hlsQueryParamSecretKey = hlsQueryParamSecretKey;
            return this;
        }

        public Builder hlsQueryParamSecretKey(String hlsQueryParamSecretKey) {
            return hlsQueryParamSecretKey(Output.of(hlsQueryParamSecretKey));
        }

        public Builder hlsQueryParamTransitionKey(@Nullable Output<String> hlsQueryParamTransitionKey) {
            $.hlsQueryParamTransitionKey = hlsQueryParamTransitionKey;
            return this;
        }

        public Builder hlsQueryParamTransitionKey(String hlsQueryParamTransitionKey) {
            return hlsQueryParamTransitionKey(Output.of(hlsQueryParamTransitionKey));
        }

        public Builder hlsShowAdvanced(@Nullable Output<Boolean> hlsShowAdvanced) {
            $.hlsShowAdvanced = hlsShowAdvanced;
            return this;
        }

        public Builder hlsShowAdvanced(Boolean hlsShowAdvanced) {
            return hlsShowAdvanced(Output.of(hlsShowAdvanced));
        }

        public Builder hlsTitle(@Nullable Output<String> hlsTitle) {
            $.hlsTitle = hlsTitle;
            return this;
        }

        public Builder hlsTitle(String hlsTitle) {
            return hlsTitle(Output.of(hlsTitle));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorManifestPersonalizationArgs build() {
            return $;
        }
    }

}