// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530BehaviorStandardTlsMigration {
    private @Nullable Boolean allowHttpsDowngrade;
    private @Nullable Boolean allowHttpsUpgrade;
    private @Nullable Integer cacheSharingDuration;
    private @Nullable String cacheSharingStartTime;
    private @Nullable Boolean enabled;
    private @Nullable Boolean isCertificateSniOnly;
    private @Nullable Boolean isTieredDistributionUsed;
    private @Nullable Boolean locked;
    private @Nullable Integer migrationDuration;
    private @Nullable String migrationFrom;
    private @Nullable String migrationStartTime;
    private @Nullable String tdLocation;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorStandardTlsMigration() {}
    public Optional<Boolean> allowHttpsDowngrade() {
        return Optional.ofNullable(this.allowHttpsDowngrade);
    }
    public Optional<Boolean> allowHttpsUpgrade() {
        return Optional.ofNullable(this.allowHttpsUpgrade);
    }
    public Optional<Integer> cacheSharingDuration() {
        return Optional.ofNullable(this.cacheSharingDuration);
    }
    public Optional<String> cacheSharingStartTime() {
        return Optional.ofNullable(this.cacheSharingStartTime);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> isCertificateSniOnly() {
        return Optional.ofNullable(this.isCertificateSniOnly);
    }
    public Optional<Boolean> isTieredDistributionUsed() {
        return Optional.ofNullable(this.isTieredDistributionUsed);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<Integer> migrationDuration() {
        return Optional.ofNullable(this.migrationDuration);
    }
    public Optional<String> migrationFrom() {
        return Optional.ofNullable(this.migrationFrom);
    }
    public Optional<String> migrationStartTime() {
        return Optional.ofNullable(this.migrationStartTime);
    }
    public Optional<String> tdLocation() {
        return Optional.ofNullable(this.tdLocation);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorStandardTlsMigration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowHttpsDowngrade;
        private @Nullable Boolean allowHttpsUpgrade;
        private @Nullable Integer cacheSharingDuration;
        private @Nullable String cacheSharingStartTime;
        private @Nullable Boolean enabled;
        private @Nullable Boolean isCertificateSniOnly;
        private @Nullable Boolean isTieredDistributionUsed;
        private @Nullable Boolean locked;
        private @Nullable Integer migrationDuration;
        private @Nullable String migrationFrom;
        private @Nullable String migrationStartTime;
        private @Nullable String tdLocation;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorStandardTlsMigration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowHttpsDowngrade = defaults.allowHttpsDowngrade;
    	      this.allowHttpsUpgrade = defaults.allowHttpsUpgrade;
    	      this.cacheSharingDuration = defaults.cacheSharingDuration;
    	      this.cacheSharingStartTime = defaults.cacheSharingStartTime;
    	      this.enabled = defaults.enabled;
    	      this.isCertificateSniOnly = defaults.isCertificateSniOnly;
    	      this.isTieredDistributionUsed = defaults.isTieredDistributionUsed;
    	      this.locked = defaults.locked;
    	      this.migrationDuration = defaults.migrationDuration;
    	      this.migrationFrom = defaults.migrationFrom;
    	      this.migrationStartTime = defaults.migrationStartTime;
    	      this.tdLocation = defaults.tdLocation;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder allowHttpsDowngrade(@Nullable Boolean allowHttpsDowngrade) {
            this.allowHttpsDowngrade = allowHttpsDowngrade;
            return this;
        }
        @CustomType.Setter
        public Builder allowHttpsUpgrade(@Nullable Boolean allowHttpsUpgrade) {
            this.allowHttpsUpgrade = allowHttpsUpgrade;
            return this;
        }
        @CustomType.Setter
        public Builder cacheSharingDuration(@Nullable Integer cacheSharingDuration) {
            this.cacheSharingDuration = cacheSharingDuration;
            return this;
        }
        @CustomType.Setter
        public Builder cacheSharingStartTime(@Nullable String cacheSharingStartTime) {
            this.cacheSharingStartTime = cacheSharingStartTime;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder isCertificateSniOnly(@Nullable Boolean isCertificateSniOnly) {
            this.isCertificateSniOnly = isCertificateSniOnly;
            return this;
        }
        @CustomType.Setter
        public Builder isTieredDistributionUsed(@Nullable Boolean isTieredDistributionUsed) {
            this.isTieredDistributionUsed = isTieredDistributionUsed;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder migrationDuration(@Nullable Integer migrationDuration) {
            this.migrationDuration = migrationDuration;
            return this;
        }
        @CustomType.Setter
        public Builder migrationFrom(@Nullable String migrationFrom) {
            this.migrationFrom = migrationFrom;
            return this;
        }
        @CustomType.Setter
        public Builder migrationStartTime(@Nullable String migrationStartTime) {
            this.migrationStartTime = migrationStartTime;
            return this;
        }
        @CustomType.Setter
        public Builder tdLocation(@Nullable String tdLocation) {
            this.tdLocation = tdLocation;
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
        public GetPropertyRulesBuilderRulesV20230530BehaviorStandardTlsMigration build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorStandardTlsMigration();
            _resultValue.allowHttpsDowngrade = allowHttpsDowngrade;
            _resultValue.allowHttpsUpgrade = allowHttpsUpgrade;
            _resultValue.cacheSharingDuration = cacheSharingDuration;
            _resultValue.cacheSharingStartTime = cacheSharingStartTime;
            _resultValue.enabled = enabled;
            _resultValue.isCertificateSniOnly = isCertificateSniOnly;
            _resultValue.isTieredDistributionUsed = isTieredDistributionUsed;
            _resultValue.locked = locked;
            _resultValue.migrationDuration = migrationDuration;
            _resultValue.migrationFrom = migrationFrom;
            _resultValue.migrationStartTime = migrationStartTime;
            _resultValue.tdLocation = tdLocation;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
