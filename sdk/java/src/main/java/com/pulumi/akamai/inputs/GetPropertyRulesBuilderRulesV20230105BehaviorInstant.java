// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorInstant extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorInstant Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorInstant();

    @Import(name="customLinkRelations")
    private @Nullable List<String> customLinkRelations;

    public Optional<List<String>> customLinkRelations() {
        return Optional.ofNullable(this.customLinkRelations);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="prefetchCacheable")
    private @Nullable Boolean prefetchCacheable;

    public Optional<Boolean> prefetchCacheable() {
        return Optional.ofNullable(this.prefetchCacheable);
    }

    @Import(name="prefetchHtml")
    private @Nullable Boolean prefetchHtml;

    public Optional<Boolean> prefetchHtml() {
        return Optional.ofNullable(this.prefetchHtml);
    }

    @Import(name="prefetchNoStore")
    private @Nullable Boolean prefetchNoStore;

    public Optional<Boolean> prefetchNoStore() {
        return Optional.ofNullable(this.prefetchNoStore);
    }

    @Import(name="prefetchNoStoreExtensions")
    private @Nullable List<String> prefetchNoStoreExtensions;

    public Optional<List<String>> prefetchNoStoreExtensions() {
        return Optional.ofNullable(this.prefetchNoStoreExtensions);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorInstant() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorInstant(GetPropertyRulesBuilderRulesV20230105BehaviorInstant $) {
        this.customLinkRelations = $.customLinkRelations;
        this.locked = $.locked;
        this.prefetchCacheable = $.prefetchCacheable;
        this.prefetchHtml = $.prefetchHtml;
        this.prefetchNoStore = $.prefetchNoStore;
        this.prefetchNoStoreExtensions = $.prefetchNoStoreExtensions;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorInstant defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorInstant $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorInstant();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorInstant defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorInstant(Objects.requireNonNull(defaults));
        }

        public Builder customLinkRelations(@Nullable List<String> customLinkRelations) {
            $.customLinkRelations = customLinkRelations;
            return this;
        }

        public Builder customLinkRelations(String... customLinkRelations) {
            return customLinkRelations(List.of(customLinkRelations));
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder prefetchCacheable(@Nullable Boolean prefetchCacheable) {
            $.prefetchCacheable = prefetchCacheable;
            return this;
        }

        public Builder prefetchHtml(@Nullable Boolean prefetchHtml) {
            $.prefetchHtml = prefetchHtml;
            return this;
        }

        public Builder prefetchNoStore(@Nullable Boolean prefetchNoStore) {
            $.prefetchNoStore = prefetchNoStore;
            return this;
        }

        public Builder prefetchNoStoreExtensions(@Nullable List<String> prefetchNoStoreExtensions) {
            $.prefetchNoStoreExtensions = prefetchNoStoreExtensions;
            return this;
        }

        public Builder prefetchNoStoreExtensions(String... prefetchNoStoreExtensions) {
            return prefetchNoStoreExtensions(List.of(prefetchNoStoreExtensions));
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorInstant build() {
            return $;
        }
    }

}