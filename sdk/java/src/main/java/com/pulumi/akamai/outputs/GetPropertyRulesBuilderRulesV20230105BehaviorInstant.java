// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorInstant {
    private @Nullable List<String> customLinkRelations;
    private @Nullable Boolean locked;
    private @Nullable Boolean prefetchCacheable;
    private @Nullable Boolean prefetchHtml;
    private @Nullable Boolean prefetchNoStore;
    private @Nullable List<String> prefetchNoStoreExtensions;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorInstant() {}
    public List<String> customLinkRelations() {
        return this.customLinkRelations == null ? List.of() : this.customLinkRelations;
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<Boolean> prefetchCacheable() {
        return Optional.ofNullable(this.prefetchCacheable);
    }
    public Optional<Boolean> prefetchHtml() {
        return Optional.ofNullable(this.prefetchHtml);
    }
    public Optional<Boolean> prefetchNoStore() {
        return Optional.ofNullable(this.prefetchNoStore);
    }
    public List<String> prefetchNoStoreExtensions() {
        return this.prefetchNoStoreExtensions == null ? List.of() : this.prefetchNoStoreExtensions;
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorInstant defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> customLinkRelations;
        private @Nullable Boolean locked;
        private @Nullable Boolean prefetchCacheable;
        private @Nullable Boolean prefetchHtml;
        private @Nullable Boolean prefetchNoStore;
        private @Nullable List<String> prefetchNoStoreExtensions;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorInstant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customLinkRelations = defaults.customLinkRelations;
    	      this.locked = defaults.locked;
    	      this.prefetchCacheable = defaults.prefetchCacheable;
    	      this.prefetchHtml = defaults.prefetchHtml;
    	      this.prefetchNoStore = defaults.prefetchNoStore;
    	      this.prefetchNoStoreExtensions = defaults.prefetchNoStoreExtensions;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder customLinkRelations(@Nullable List<String> customLinkRelations) {
            this.customLinkRelations = customLinkRelations;
            return this;
        }
        public Builder customLinkRelations(String... customLinkRelations) {
            return customLinkRelations(List.of(customLinkRelations));
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder prefetchCacheable(@Nullable Boolean prefetchCacheable) {
            this.prefetchCacheable = prefetchCacheable;
            return this;
        }
        @CustomType.Setter
        public Builder prefetchHtml(@Nullable Boolean prefetchHtml) {
            this.prefetchHtml = prefetchHtml;
            return this;
        }
        @CustomType.Setter
        public Builder prefetchNoStore(@Nullable Boolean prefetchNoStore) {
            this.prefetchNoStore = prefetchNoStore;
            return this;
        }
        @CustomType.Setter
        public Builder prefetchNoStoreExtensions(@Nullable List<String> prefetchNoStoreExtensions) {
            this.prefetchNoStoreExtensions = prefetchNoStoreExtensions;
            return this;
        }
        public Builder prefetchNoStoreExtensions(String... prefetchNoStoreExtensions) {
            return prefetchNoStoreExtensions(List.of(prefetchNoStoreExtensions));
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
        public GetPropertyRulesBuilderRulesV20230105BehaviorInstant build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorInstant();
            _resultValue.customLinkRelations = customLinkRelations;
            _resultValue.locked = locked;
            _resultValue.prefetchCacheable = prefetchCacheable;
            _resultValue.prefetchHtml = prefetchHtml;
            _resultValue.prefetchNoStore = prefetchNoStore;
            _resultValue.prefetchNoStoreExtensions = prefetchNoStoreExtensions;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
