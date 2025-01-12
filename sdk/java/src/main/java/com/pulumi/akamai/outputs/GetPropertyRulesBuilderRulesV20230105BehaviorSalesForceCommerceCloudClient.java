// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorSalesForceCommerceCloudClient {
    private @Nullable Boolean allowOverrideOriginCacheKey;
    private @Nullable String connectorId;
    private @Nullable Boolean enabled;
    private @Nullable Boolean locked;
    private @Nullable String originHostHeader;
    private @Nullable String originType;
    private @Nullable String sf3cOriginHost;
    private @Nullable String sf3cOriginHostHeader;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorSalesForceCommerceCloudClient() {}
    public Optional<Boolean> allowOverrideOriginCacheKey() {
        return Optional.ofNullable(this.allowOverrideOriginCacheKey);
    }
    public Optional<String> connectorId() {
        return Optional.ofNullable(this.connectorId);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> originHostHeader() {
        return Optional.ofNullable(this.originHostHeader);
    }
    public Optional<String> originType() {
        return Optional.ofNullable(this.originType);
    }
    public Optional<String> sf3cOriginHost() {
        return Optional.ofNullable(this.sf3cOriginHost);
    }
    public Optional<String> sf3cOriginHostHeader() {
        return Optional.ofNullable(this.sf3cOriginHostHeader);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorSalesForceCommerceCloudClient defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowOverrideOriginCacheKey;
        private @Nullable String connectorId;
        private @Nullable Boolean enabled;
        private @Nullable Boolean locked;
        private @Nullable String originHostHeader;
        private @Nullable String originType;
        private @Nullable String sf3cOriginHost;
        private @Nullable String sf3cOriginHostHeader;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorSalesForceCommerceCloudClient defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowOverrideOriginCacheKey = defaults.allowOverrideOriginCacheKey;
    	      this.connectorId = defaults.connectorId;
    	      this.enabled = defaults.enabled;
    	      this.locked = defaults.locked;
    	      this.originHostHeader = defaults.originHostHeader;
    	      this.originType = defaults.originType;
    	      this.sf3cOriginHost = defaults.sf3cOriginHost;
    	      this.sf3cOriginHostHeader = defaults.sf3cOriginHostHeader;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder allowOverrideOriginCacheKey(@Nullable Boolean allowOverrideOriginCacheKey) {
            this.allowOverrideOriginCacheKey = allowOverrideOriginCacheKey;
            return this;
        }
        @CustomType.Setter
        public Builder connectorId(@Nullable String connectorId) {
            this.connectorId = connectorId;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder originHostHeader(@Nullable String originHostHeader) {
            this.originHostHeader = originHostHeader;
            return this;
        }
        @CustomType.Setter
        public Builder originType(@Nullable String originType) {
            this.originType = originType;
            return this;
        }
        @CustomType.Setter
        public Builder sf3cOriginHost(@Nullable String sf3cOriginHost) {
            this.sf3cOriginHost = sf3cOriginHost;
            return this;
        }
        @CustomType.Setter
        public Builder sf3cOriginHostHeader(@Nullable String sf3cOriginHostHeader) {
            this.sf3cOriginHostHeader = sf3cOriginHostHeader;
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
        public GetPropertyRulesBuilderRulesV20230105BehaviorSalesForceCommerceCloudClient build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorSalesForceCommerceCloudClient();
            _resultValue.allowOverrideOriginCacheKey = allowOverrideOriginCacheKey;
            _resultValue.connectorId = connectorId;
            _resultValue.enabled = enabled;
            _resultValue.locked = locked;
            _resultValue.originHostHeader = originHostHeader;
            _resultValue.originType = originType;
            _resultValue.sf3cOriginHost = sf3cOriginHost;
            _resultValue.sf3cOriginHostHeader = sf3cOriginHostHeader;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
