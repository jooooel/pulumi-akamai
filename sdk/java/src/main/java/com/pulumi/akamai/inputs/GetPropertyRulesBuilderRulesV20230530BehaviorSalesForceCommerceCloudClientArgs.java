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


public final class GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs();

    @Import(name="allowOverrideOriginCacheKey")
    private @Nullable Output<Boolean> allowOverrideOriginCacheKey;

    public Optional<Output<Boolean>> allowOverrideOriginCacheKey() {
        return Optional.ofNullable(this.allowOverrideOriginCacheKey);
    }

    @Import(name="connectorId")
    private @Nullable Output<String> connectorId;

    public Optional<Output<String>> connectorId() {
        return Optional.ofNullable(this.connectorId);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="originHostHeader")
    private @Nullable Output<String> originHostHeader;

    public Optional<Output<String>> originHostHeader() {
        return Optional.ofNullable(this.originHostHeader);
    }

    @Import(name="originType")
    private @Nullable Output<String> originType;

    public Optional<Output<String>> originType() {
        return Optional.ofNullable(this.originType);
    }

    @Import(name="sf3cOriginHost")
    private @Nullable Output<String> sf3cOriginHost;

    public Optional<Output<String>> sf3cOriginHost() {
        return Optional.ofNullable(this.sf3cOriginHost);
    }

    @Import(name="sf3cOriginHostHeader")
    private @Nullable Output<String> sf3cOriginHostHeader;

    public Optional<Output<String>> sf3cOriginHostHeader() {
        return Optional.ofNullable(this.sf3cOriginHostHeader);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs(GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs $) {
        this.allowOverrideOriginCacheKey = $.allowOverrideOriginCacheKey;
        this.connectorId = $.connectorId;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.originHostHeader = $.originHostHeader;
        this.originType = $.originType;
        this.sf3cOriginHost = $.sf3cOriginHost;
        this.sf3cOriginHostHeader = $.sf3cOriginHostHeader;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowOverrideOriginCacheKey(@Nullable Output<Boolean> allowOverrideOriginCacheKey) {
            $.allowOverrideOriginCacheKey = allowOverrideOriginCacheKey;
            return this;
        }

        public Builder allowOverrideOriginCacheKey(Boolean allowOverrideOriginCacheKey) {
            return allowOverrideOriginCacheKey(Output.of(allowOverrideOriginCacheKey));
        }

        public Builder connectorId(@Nullable Output<String> connectorId) {
            $.connectorId = connectorId;
            return this;
        }

        public Builder connectorId(String connectorId) {
            return connectorId(Output.of(connectorId));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder originHostHeader(@Nullable Output<String> originHostHeader) {
            $.originHostHeader = originHostHeader;
            return this;
        }

        public Builder originHostHeader(String originHostHeader) {
            return originHostHeader(Output.of(originHostHeader));
        }

        public Builder originType(@Nullable Output<String> originType) {
            $.originType = originType;
            return this;
        }

        public Builder originType(String originType) {
            return originType(Output.of(originType));
        }

        public Builder sf3cOriginHost(@Nullable Output<String> sf3cOriginHost) {
            $.sf3cOriginHost = sf3cOriginHost;
            return this;
        }

        public Builder sf3cOriginHost(String sf3cOriginHost) {
            return sf3cOriginHost(Output.of(sf3cOriginHost));
        }

        public Builder sf3cOriginHostHeader(@Nullable Output<String> sf3cOriginHostHeader) {
            $.sf3cOriginHostHeader = sf3cOriginHostHeader;
            return this;
        }

        public Builder sf3cOriginHostHeader(String sf3cOriginHostHeader) {
            return sf3cOriginHostHeader(Output.of(sf3cOriginHostHeader));
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientArgs build() {
            return $;
        }
    }

}
