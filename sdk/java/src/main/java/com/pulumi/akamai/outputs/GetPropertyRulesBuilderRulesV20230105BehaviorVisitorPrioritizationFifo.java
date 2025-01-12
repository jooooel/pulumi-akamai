// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationFifo {
    private @Nullable String accessTitle;
    private @Nullable Integer cloudletSharedPolicy;
    private @Nullable String customCookieDomain;
    private @Nullable String domainConfig;
    private @Nullable Boolean locked;
    private @Nullable Boolean sessionAutoProlong;
    private @Nullable Integer sessionDuration;
    private @Nullable String templateUuid;
    private @Nullable String uuid;
    private @Nullable List<String> waitingRoomAssetsPaths;
    private @Nullable String waitingRoomPath;
    private @Nullable String waitingRoomTitle;

    private GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationFifo() {}
    public Optional<String> accessTitle() {
        return Optional.ofNullable(this.accessTitle);
    }
    public Optional<Integer> cloudletSharedPolicy() {
        return Optional.ofNullable(this.cloudletSharedPolicy);
    }
    public Optional<String> customCookieDomain() {
        return Optional.ofNullable(this.customCookieDomain);
    }
    public Optional<String> domainConfig() {
        return Optional.ofNullable(this.domainConfig);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<Boolean> sessionAutoProlong() {
        return Optional.ofNullable(this.sessionAutoProlong);
    }
    public Optional<Integer> sessionDuration() {
        return Optional.ofNullable(this.sessionDuration);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public List<String> waitingRoomAssetsPaths() {
        return this.waitingRoomAssetsPaths == null ? List.of() : this.waitingRoomAssetsPaths;
    }
    public Optional<String> waitingRoomPath() {
        return Optional.ofNullable(this.waitingRoomPath);
    }
    public Optional<String> waitingRoomTitle() {
        return Optional.ofNullable(this.waitingRoomTitle);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationFifo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessTitle;
        private @Nullable Integer cloudletSharedPolicy;
        private @Nullable String customCookieDomain;
        private @Nullable String domainConfig;
        private @Nullable Boolean locked;
        private @Nullable Boolean sessionAutoProlong;
        private @Nullable Integer sessionDuration;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        private @Nullable List<String> waitingRoomAssetsPaths;
        private @Nullable String waitingRoomPath;
        private @Nullable String waitingRoomTitle;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationFifo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTitle = defaults.accessTitle;
    	      this.cloudletSharedPolicy = defaults.cloudletSharedPolicy;
    	      this.customCookieDomain = defaults.customCookieDomain;
    	      this.domainConfig = defaults.domainConfig;
    	      this.locked = defaults.locked;
    	      this.sessionAutoProlong = defaults.sessionAutoProlong;
    	      this.sessionDuration = defaults.sessionDuration;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
    	      this.waitingRoomAssetsPaths = defaults.waitingRoomAssetsPaths;
    	      this.waitingRoomPath = defaults.waitingRoomPath;
    	      this.waitingRoomTitle = defaults.waitingRoomTitle;
        }

        @CustomType.Setter
        public Builder accessTitle(@Nullable String accessTitle) {
            this.accessTitle = accessTitle;
            return this;
        }
        @CustomType.Setter
        public Builder cloudletSharedPolicy(@Nullable Integer cloudletSharedPolicy) {
            this.cloudletSharedPolicy = cloudletSharedPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder customCookieDomain(@Nullable String customCookieDomain) {
            this.customCookieDomain = customCookieDomain;
            return this;
        }
        @CustomType.Setter
        public Builder domainConfig(@Nullable String domainConfig) {
            this.domainConfig = domainConfig;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder sessionAutoProlong(@Nullable Boolean sessionAutoProlong) {
            this.sessionAutoProlong = sessionAutoProlong;
            return this;
        }
        @CustomType.Setter
        public Builder sessionDuration(@Nullable Integer sessionDuration) {
            this.sessionDuration = sessionDuration;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomAssetsPaths(@Nullable List<String> waitingRoomAssetsPaths) {
            this.waitingRoomAssetsPaths = waitingRoomAssetsPaths;
            return this;
        }
        public Builder waitingRoomAssetsPaths(String... waitingRoomAssetsPaths) {
            return waitingRoomAssetsPaths(List.of(waitingRoomAssetsPaths));
        }
        @CustomType.Setter
        public Builder waitingRoomPath(@Nullable String waitingRoomPath) {
            this.waitingRoomPath = waitingRoomPath;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomTitle(@Nullable String waitingRoomTitle) {
            this.waitingRoomTitle = waitingRoomTitle;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationFifo build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationFifo();
            _resultValue.accessTitle = accessTitle;
            _resultValue.cloudletSharedPolicy = cloudletSharedPolicy;
            _resultValue.customCookieDomain = customCookieDomain;
            _resultValue.domainConfig = domainConfig;
            _resultValue.locked = locked;
            _resultValue.sessionAutoProlong = sessionAutoProlong;
            _resultValue.sessionDuration = sessionDuration;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            _resultValue.waitingRoomAssetsPaths = waitingRoomAssetsPaths;
            _resultValue.waitingRoomPath = waitingRoomPath;
            _resultValue.waitingRoomTitle = waitingRoomTitle;
            return _resultValue;
        }
    }
}
