// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerAllDownNetStorage;
import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerCloudletPolicy;
import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerFailoverOriginMap;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancer {
    private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerAllDownNetStorage allDownNetStorage;
    private @Nullable String allDownNetStorageFile;
    private @Nullable String allDownStatusCode;
    private @Nullable String allDownTitle;
    private @Nullable Boolean allowCachePrefresh;
    private @Nullable String cachedContentTitle;
    private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerCloudletPolicy cloudletPolicy;
    private @Nullable Boolean enabled;
    private @Nullable Integer failoverAttemptsThreshold;
    private @Nullable String failoverMode;
    private @Nullable List<GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerFailoverOriginMap> failoverOriginMaps;
    private @Nullable List<String> failoverStatusCodes;
    private @Nullable String failoverTitle;
    private @Nullable String label;
    private @Nullable Boolean locked;
    private @Nullable String originCookieName;
    private @Nullable Boolean specifyStickinessCookieDomain;
    private @Nullable Boolean stickinessCookieAutomaticSalt;
    private @Nullable String stickinessCookieDomain;
    private @Nullable String stickinessCookieSalt;
    private @Nullable Boolean stickinessCookieSetHttpOnlyFlag;
    private @Nullable String stickinessCookieType;
    private @Nullable String stickinessDuration;
    private @Nullable String stickinessExpirationDate;
    private @Nullable Boolean stickinessRefresh;
    private @Nullable String stickinessTitle;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancer() {}
    public Optional<GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerAllDownNetStorage> allDownNetStorage() {
        return Optional.ofNullable(this.allDownNetStorage);
    }
    public Optional<String> allDownNetStorageFile() {
        return Optional.ofNullable(this.allDownNetStorageFile);
    }
    public Optional<String> allDownStatusCode() {
        return Optional.ofNullable(this.allDownStatusCode);
    }
    public Optional<String> allDownTitle() {
        return Optional.ofNullable(this.allDownTitle);
    }
    public Optional<Boolean> allowCachePrefresh() {
        return Optional.ofNullable(this.allowCachePrefresh);
    }
    public Optional<String> cachedContentTitle() {
        return Optional.ofNullable(this.cachedContentTitle);
    }
    public Optional<GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerCloudletPolicy> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Integer> failoverAttemptsThreshold() {
        return Optional.ofNullable(this.failoverAttemptsThreshold);
    }
    public Optional<String> failoverMode() {
        return Optional.ofNullable(this.failoverMode);
    }
    public List<GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerFailoverOriginMap> failoverOriginMaps() {
        return this.failoverOriginMaps == null ? List.of() : this.failoverOriginMaps;
    }
    public List<String> failoverStatusCodes() {
        return this.failoverStatusCodes == null ? List.of() : this.failoverStatusCodes;
    }
    public Optional<String> failoverTitle() {
        return Optional.ofNullable(this.failoverTitle);
    }
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> originCookieName() {
        return Optional.ofNullable(this.originCookieName);
    }
    public Optional<Boolean> specifyStickinessCookieDomain() {
        return Optional.ofNullable(this.specifyStickinessCookieDomain);
    }
    public Optional<Boolean> stickinessCookieAutomaticSalt() {
        return Optional.ofNullable(this.stickinessCookieAutomaticSalt);
    }
    public Optional<String> stickinessCookieDomain() {
        return Optional.ofNullable(this.stickinessCookieDomain);
    }
    public Optional<String> stickinessCookieSalt() {
        return Optional.ofNullable(this.stickinessCookieSalt);
    }
    public Optional<Boolean> stickinessCookieSetHttpOnlyFlag() {
        return Optional.ofNullable(this.stickinessCookieSetHttpOnlyFlag);
    }
    public Optional<String> stickinessCookieType() {
        return Optional.ofNullable(this.stickinessCookieType);
    }
    public Optional<String> stickinessDuration() {
        return Optional.ofNullable(this.stickinessDuration);
    }
    public Optional<String> stickinessExpirationDate() {
        return Optional.ofNullable(this.stickinessExpirationDate);
    }
    public Optional<Boolean> stickinessRefresh() {
        return Optional.ofNullable(this.stickinessRefresh);
    }
    public Optional<String> stickinessTitle() {
        return Optional.ofNullable(this.stickinessTitle);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerAllDownNetStorage allDownNetStorage;
        private @Nullable String allDownNetStorageFile;
        private @Nullable String allDownStatusCode;
        private @Nullable String allDownTitle;
        private @Nullable Boolean allowCachePrefresh;
        private @Nullable String cachedContentTitle;
        private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerCloudletPolicy cloudletPolicy;
        private @Nullable Boolean enabled;
        private @Nullable Integer failoverAttemptsThreshold;
        private @Nullable String failoverMode;
        private @Nullable List<GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerFailoverOriginMap> failoverOriginMaps;
        private @Nullable List<String> failoverStatusCodes;
        private @Nullable String failoverTitle;
        private @Nullable String label;
        private @Nullable Boolean locked;
        private @Nullable String originCookieName;
        private @Nullable Boolean specifyStickinessCookieDomain;
        private @Nullable Boolean stickinessCookieAutomaticSalt;
        private @Nullable String stickinessCookieDomain;
        private @Nullable String stickinessCookieSalt;
        private @Nullable Boolean stickinessCookieSetHttpOnlyFlag;
        private @Nullable String stickinessCookieType;
        private @Nullable String stickinessDuration;
        private @Nullable String stickinessExpirationDate;
        private @Nullable Boolean stickinessRefresh;
        private @Nullable String stickinessTitle;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allDownNetStorage = defaults.allDownNetStorage;
    	      this.allDownNetStorageFile = defaults.allDownNetStorageFile;
    	      this.allDownStatusCode = defaults.allDownStatusCode;
    	      this.allDownTitle = defaults.allDownTitle;
    	      this.allowCachePrefresh = defaults.allowCachePrefresh;
    	      this.cachedContentTitle = defaults.cachedContentTitle;
    	      this.cloudletPolicy = defaults.cloudletPolicy;
    	      this.enabled = defaults.enabled;
    	      this.failoverAttemptsThreshold = defaults.failoverAttemptsThreshold;
    	      this.failoverMode = defaults.failoverMode;
    	      this.failoverOriginMaps = defaults.failoverOriginMaps;
    	      this.failoverStatusCodes = defaults.failoverStatusCodes;
    	      this.failoverTitle = defaults.failoverTitle;
    	      this.label = defaults.label;
    	      this.locked = defaults.locked;
    	      this.originCookieName = defaults.originCookieName;
    	      this.specifyStickinessCookieDomain = defaults.specifyStickinessCookieDomain;
    	      this.stickinessCookieAutomaticSalt = defaults.stickinessCookieAutomaticSalt;
    	      this.stickinessCookieDomain = defaults.stickinessCookieDomain;
    	      this.stickinessCookieSalt = defaults.stickinessCookieSalt;
    	      this.stickinessCookieSetHttpOnlyFlag = defaults.stickinessCookieSetHttpOnlyFlag;
    	      this.stickinessCookieType = defaults.stickinessCookieType;
    	      this.stickinessDuration = defaults.stickinessDuration;
    	      this.stickinessExpirationDate = defaults.stickinessExpirationDate;
    	      this.stickinessRefresh = defaults.stickinessRefresh;
    	      this.stickinessTitle = defaults.stickinessTitle;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder allDownNetStorage(@Nullable GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerAllDownNetStorage allDownNetStorage) {
            this.allDownNetStorage = allDownNetStorage;
            return this;
        }
        @CustomType.Setter
        public Builder allDownNetStorageFile(@Nullable String allDownNetStorageFile) {
            this.allDownNetStorageFile = allDownNetStorageFile;
            return this;
        }
        @CustomType.Setter
        public Builder allDownStatusCode(@Nullable String allDownStatusCode) {
            this.allDownStatusCode = allDownStatusCode;
            return this;
        }
        @CustomType.Setter
        public Builder allDownTitle(@Nullable String allDownTitle) {
            this.allDownTitle = allDownTitle;
            return this;
        }
        @CustomType.Setter
        public Builder allowCachePrefresh(@Nullable Boolean allowCachePrefresh) {
            this.allowCachePrefresh = allowCachePrefresh;
            return this;
        }
        @CustomType.Setter
        public Builder cachedContentTitle(@Nullable String cachedContentTitle) {
            this.cachedContentTitle = cachedContentTitle;
            return this;
        }
        @CustomType.Setter
        public Builder cloudletPolicy(@Nullable GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerCloudletPolicy cloudletPolicy) {
            this.cloudletPolicy = cloudletPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder failoverAttemptsThreshold(@Nullable Integer failoverAttemptsThreshold) {
            this.failoverAttemptsThreshold = failoverAttemptsThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder failoverMode(@Nullable String failoverMode) {
            this.failoverMode = failoverMode;
            return this;
        }
        @CustomType.Setter
        public Builder failoverOriginMaps(@Nullable List<GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerFailoverOriginMap> failoverOriginMaps) {
            this.failoverOriginMaps = failoverOriginMaps;
            return this;
        }
        public Builder failoverOriginMaps(GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancerFailoverOriginMap... failoverOriginMaps) {
            return failoverOriginMaps(List.of(failoverOriginMaps));
        }
        @CustomType.Setter
        public Builder failoverStatusCodes(@Nullable List<String> failoverStatusCodes) {
            this.failoverStatusCodes = failoverStatusCodes;
            return this;
        }
        public Builder failoverStatusCodes(String... failoverStatusCodes) {
            return failoverStatusCodes(List.of(failoverStatusCodes));
        }
        @CustomType.Setter
        public Builder failoverTitle(@Nullable String failoverTitle) {
            this.failoverTitle = failoverTitle;
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder originCookieName(@Nullable String originCookieName) {
            this.originCookieName = originCookieName;
            return this;
        }
        @CustomType.Setter
        public Builder specifyStickinessCookieDomain(@Nullable Boolean specifyStickinessCookieDomain) {
            this.specifyStickinessCookieDomain = specifyStickinessCookieDomain;
            return this;
        }
        @CustomType.Setter
        public Builder stickinessCookieAutomaticSalt(@Nullable Boolean stickinessCookieAutomaticSalt) {
            this.stickinessCookieAutomaticSalt = stickinessCookieAutomaticSalt;
            return this;
        }
        @CustomType.Setter
        public Builder stickinessCookieDomain(@Nullable String stickinessCookieDomain) {
            this.stickinessCookieDomain = stickinessCookieDomain;
            return this;
        }
        @CustomType.Setter
        public Builder stickinessCookieSalt(@Nullable String stickinessCookieSalt) {
            this.stickinessCookieSalt = stickinessCookieSalt;
            return this;
        }
        @CustomType.Setter
        public Builder stickinessCookieSetHttpOnlyFlag(@Nullable Boolean stickinessCookieSetHttpOnlyFlag) {
            this.stickinessCookieSetHttpOnlyFlag = stickinessCookieSetHttpOnlyFlag;
            return this;
        }
        @CustomType.Setter
        public Builder stickinessCookieType(@Nullable String stickinessCookieType) {
            this.stickinessCookieType = stickinessCookieType;
            return this;
        }
        @CustomType.Setter
        public Builder stickinessDuration(@Nullable String stickinessDuration) {
            this.stickinessDuration = stickinessDuration;
            return this;
        }
        @CustomType.Setter
        public Builder stickinessExpirationDate(@Nullable String stickinessExpirationDate) {
            this.stickinessExpirationDate = stickinessExpirationDate;
            return this;
        }
        @CustomType.Setter
        public Builder stickinessRefresh(@Nullable Boolean stickinessRefresh) {
            this.stickinessRefresh = stickinessRefresh;
            return this;
        }
        @CustomType.Setter
        public Builder stickinessTitle(@Nullable String stickinessTitle) {
            this.stickinessTitle = stickinessTitle;
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
        public GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancer build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorApplicationLoadBalancer();
            _resultValue.allDownNetStorage = allDownNetStorage;
            _resultValue.allDownNetStorageFile = allDownNetStorageFile;
            _resultValue.allDownStatusCode = allDownStatusCode;
            _resultValue.allDownTitle = allDownTitle;
            _resultValue.allowCachePrefresh = allowCachePrefresh;
            _resultValue.cachedContentTitle = cachedContentTitle;
            _resultValue.cloudletPolicy = cloudletPolicy;
            _resultValue.enabled = enabled;
            _resultValue.failoverAttemptsThreshold = failoverAttemptsThreshold;
            _resultValue.failoverMode = failoverMode;
            _resultValue.failoverOriginMaps = failoverOriginMaps;
            _resultValue.failoverStatusCodes = failoverStatusCodes;
            _resultValue.failoverTitle = failoverTitle;
            _resultValue.label = label;
            _resultValue.locked = locked;
            _resultValue.originCookieName = originCookieName;
            _resultValue.specifyStickinessCookieDomain = specifyStickinessCookieDomain;
            _resultValue.stickinessCookieAutomaticSalt = stickinessCookieAutomaticSalt;
            _resultValue.stickinessCookieDomain = stickinessCookieDomain;
            _resultValue.stickinessCookieSalt = stickinessCookieSalt;
            _resultValue.stickinessCookieSetHttpOnlyFlag = stickinessCookieSetHttpOnlyFlag;
            _resultValue.stickinessCookieType = stickinessCookieType;
            _resultValue.stickinessDuration = stickinessDuration;
            _resultValue.stickinessExpirationDate = stickinessExpirationDate;
            _resultValue.stickinessRefresh = stickinessRefresh;
            _resultValue.stickinessTitle = stickinessTitle;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
