// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorLargeFileOptimizationAdvanced extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorLargeFileOptimizationAdvanced Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorLargeFileOptimizationAdvanced();

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="fragmentSize")
    private @Nullable String fragmentSize;

    public Optional<String> fragmentSize() {
        return Optional.ofNullable(this.fragmentSize);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="objectSize")
    private @Nullable String objectSize;

    public Optional<String> objectSize() {
        return Optional.ofNullable(this.objectSize);
    }

    @Import(name="prefetchAfterRequest")
    private @Nullable Integer prefetchAfterRequest;

    public Optional<Integer> prefetchAfterRequest() {
        return Optional.ofNullable(this.prefetchAfterRequest);
    }

    @Import(name="prefetchDuringRequest")
    private @Nullable Integer prefetchDuringRequest;

    public Optional<Integer> prefetchDuringRequest() {
        return Optional.ofNullable(this.prefetchDuringRequest);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorLargeFileOptimizationAdvanced() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorLargeFileOptimizationAdvanced(GetPropertyRulesBuilderRulesV20230105BehaviorLargeFileOptimizationAdvanced $) {
        this.enabled = $.enabled;
        this.fragmentSize = $.fragmentSize;
        this.locked = $.locked;
        this.objectSize = $.objectSize;
        this.prefetchAfterRequest = $.prefetchAfterRequest;
        this.prefetchDuringRequest = $.prefetchDuringRequest;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorLargeFileOptimizationAdvanced defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorLargeFileOptimizationAdvanced $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorLargeFileOptimizationAdvanced();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorLargeFileOptimizationAdvanced defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorLargeFileOptimizationAdvanced(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder fragmentSize(@Nullable String fragmentSize) {
            $.fragmentSize = fragmentSize;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder objectSize(@Nullable String objectSize) {
            $.objectSize = objectSize;
            return this;
        }

        public Builder prefetchAfterRequest(@Nullable Integer prefetchAfterRequest) {
            $.prefetchAfterRequest = prefetchAfterRequest;
            return this;
        }

        public Builder prefetchDuringRequest(@Nullable Integer prefetchDuringRequest) {
            $.prefetchDuringRequest = prefetchDuringRequest;
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorLargeFileOptimizationAdvanced build() {
            return $;
        }
    }

}
