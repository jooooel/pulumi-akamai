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


public final class GetPropertyRulesBuilderRulesV20230530BehaviorAdaptiveAccelerationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorAdaptiveAccelerationArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorAdaptiveAccelerationArgs();

    @Import(name="abLogic")
    private @Nullable Output<String> abLogic;

    public Optional<Output<String>> abLogic() {
        return Optional.ofNullable(this.abLogic);
    }

    @Import(name="abTesting")
    private @Nullable Output<String> abTesting;

    public Optional<Output<String>> abTesting() {
        return Optional.ofNullable(this.abTesting);
    }

    @Import(name="compression")
    private @Nullable Output<String> compression;

    public Optional<Output<String>> compression() {
        return Optional.ofNullable(this.compression);
    }

    @Import(name="cookieName")
    private @Nullable Output<String> cookieName;

    public Optional<Output<String>> cookieName() {
        return Optional.ofNullable(this.cookieName);
    }

    @Import(name="enableBrotliCompression")
    private @Nullable Output<Boolean> enableBrotliCompression;

    public Optional<Output<Boolean>> enableBrotliCompression() {
        return Optional.ofNullable(this.enableBrotliCompression);
    }

    @Import(name="enableForNoncacheable")
    private @Nullable Output<Boolean> enableForNoncacheable;

    public Optional<Output<Boolean>> enableForNoncacheable() {
        return Optional.ofNullable(this.enableForNoncacheable);
    }

    @Import(name="enablePreconnect")
    private @Nullable Output<Boolean> enablePreconnect;

    public Optional<Output<Boolean>> enablePreconnect() {
        return Optional.ofNullable(this.enablePreconnect);
    }

    @Import(name="enablePush")
    private @Nullable Output<Boolean> enablePush;

    public Optional<Output<Boolean>> enablePush() {
        return Optional.ofNullable(this.enablePush);
    }

    @Import(name="enableRo")
    private @Nullable Output<Boolean> enableRo;

    public Optional<Output<Boolean>> enableRo() {
        return Optional.ofNullable(this.enableRo);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="preloadEnable")
    private @Nullable Output<Boolean> preloadEnable;

    public Optional<Output<Boolean>> preloadEnable() {
        return Optional.ofNullable(this.preloadEnable);
    }

    @Import(name="source")
    private @Nullable Output<String> source;

    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="titleBrotli")
    private @Nullable Output<String> titleBrotli;

    public Optional<Output<String>> titleBrotli() {
        return Optional.ofNullable(this.titleBrotli);
    }

    @Import(name="titleHttp2ServerPush")
    private @Nullable Output<String> titleHttp2ServerPush;

    public Optional<Output<String>> titleHttp2ServerPush() {
        return Optional.ofNullable(this.titleHttp2ServerPush);
    }

    @Import(name="titlePreconnect")
    private @Nullable Output<String> titlePreconnect;

    public Optional<Output<String>> titlePreconnect() {
        return Optional.ofNullable(this.titlePreconnect);
    }

    @Import(name="titlePreload")
    private @Nullable Output<String> titlePreload;

    public Optional<Output<String>> titlePreload() {
        return Optional.ofNullable(this.titlePreload);
    }

    @Import(name="titleRo")
    private @Nullable Output<String> titleRo;

    public Optional<Output<String>> titleRo() {
        return Optional.ofNullable(this.titleRo);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorAdaptiveAccelerationArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorAdaptiveAccelerationArgs(GetPropertyRulesBuilderRulesV20230530BehaviorAdaptiveAccelerationArgs $) {
        this.abLogic = $.abLogic;
        this.abTesting = $.abTesting;
        this.compression = $.compression;
        this.cookieName = $.cookieName;
        this.enableBrotliCompression = $.enableBrotliCompression;
        this.enableForNoncacheable = $.enableForNoncacheable;
        this.enablePreconnect = $.enablePreconnect;
        this.enablePush = $.enablePush;
        this.enableRo = $.enableRo;
        this.locked = $.locked;
        this.preloadEnable = $.preloadEnable;
        this.source = $.source;
        this.templateUuid = $.templateUuid;
        this.titleBrotli = $.titleBrotli;
        this.titleHttp2ServerPush = $.titleHttp2ServerPush;
        this.titlePreconnect = $.titlePreconnect;
        this.titlePreload = $.titlePreload;
        this.titleRo = $.titleRo;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorAdaptiveAccelerationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorAdaptiveAccelerationArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorAdaptiveAccelerationArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorAdaptiveAccelerationArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorAdaptiveAccelerationArgs(Objects.requireNonNull(defaults));
        }

        public Builder abLogic(@Nullable Output<String> abLogic) {
            $.abLogic = abLogic;
            return this;
        }

        public Builder abLogic(String abLogic) {
            return abLogic(Output.of(abLogic));
        }

        public Builder abTesting(@Nullable Output<String> abTesting) {
            $.abTesting = abTesting;
            return this;
        }

        public Builder abTesting(String abTesting) {
            return abTesting(Output.of(abTesting));
        }

        public Builder compression(@Nullable Output<String> compression) {
            $.compression = compression;
            return this;
        }

        public Builder compression(String compression) {
            return compression(Output.of(compression));
        }

        public Builder cookieName(@Nullable Output<String> cookieName) {
            $.cookieName = cookieName;
            return this;
        }

        public Builder cookieName(String cookieName) {
            return cookieName(Output.of(cookieName));
        }

        public Builder enableBrotliCompression(@Nullable Output<Boolean> enableBrotliCompression) {
            $.enableBrotliCompression = enableBrotliCompression;
            return this;
        }

        public Builder enableBrotliCompression(Boolean enableBrotliCompression) {
            return enableBrotliCompression(Output.of(enableBrotliCompression));
        }

        public Builder enableForNoncacheable(@Nullable Output<Boolean> enableForNoncacheable) {
            $.enableForNoncacheable = enableForNoncacheable;
            return this;
        }

        public Builder enableForNoncacheable(Boolean enableForNoncacheable) {
            return enableForNoncacheable(Output.of(enableForNoncacheable));
        }

        public Builder enablePreconnect(@Nullable Output<Boolean> enablePreconnect) {
            $.enablePreconnect = enablePreconnect;
            return this;
        }

        public Builder enablePreconnect(Boolean enablePreconnect) {
            return enablePreconnect(Output.of(enablePreconnect));
        }

        public Builder enablePush(@Nullable Output<Boolean> enablePush) {
            $.enablePush = enablePush;
            return this;
        }

        public Builder enablePush(Boolean enablePush) {
            return enablePush(Output.of(enablePush));
        }

        public Builder enableRo(@Nullable Output<Boolean> enableRo) {
            $.enableRo = enableRo;
            return this;
        }

        public Builder enableRo(Boolean enableRo) {
            return enableRo(Output.of(enableRo));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder preloadEnable(@Nullable Output<Boolean> preloadEnable) {
            $.preloadEnable = preloadEnable;
            return this;
        }

        public Builder preloadEnable(Boolean preloadEnable) {
            return preloadEnable(Output.of(preloadEnable));
        }

        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder titleBrotli(@Nullable Output<String> titleBrotli) {
            $.titleBrotli = titleBrotli;
            return this;
        }

        public Builder titleBrotli(String titleBrotli) {
            return titleBrotli(Output.of(titleBrotli));
        }

        public Builder titleHttp2ServerPush(@Nullable Output<String> titleHttp2ServerPush) {
            $.titleHttp2ServerPush = titleHttp2ServerPush;
            return this;
        }

        public Builder titleHttp2ServerPush(String titleHttp2ServerPush) {
            return titleHttp2ServerPush(Output.of(titleHttp2ServerPush));
        }

        public Builder titlePreconnect(@Nullable Output<String> titlePreconnect) {
            $.titlePreconnect = titlePreconnect;
            return this;
        }

        public Builder titlePreconnect(String titlePreconnect) {
            return titlePreconnect(Output.of(titlePreconnect));
        }

        public Builder titlePreload(@Nullable Output<String> titlePreload) {
            $.titlePreload = titlePreload;
            return this;
        }

        public Builder titlePreload(String titlePreload) {
            return titlePreload(Output.of(titlePreload));
        }

        public Builder titleRo(@Nullable Output<String> titleRo) {
            $.titleRo = titleRo;
            return this;
        }

        public Builder titleRo(String titleRo) {
            return titleRo(Output.of(titleRo));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorAdaptiveAccelerationArgs build() {
            return $;
        }
    }

}
