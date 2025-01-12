// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorRewriteUrl extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorRewriteUrl Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorRewriteUrl();

    @Import(name="behavior")
    private @Nullable String behavior;

    public Optional<String> behavior() {
        return Optional.ofNullable(this.behavior);
    }

    @Import(name="keepQueryString")
    private @Nullable Boolean keepQueryString;

    public Optional<Boolean> keepQueryString() {
        return Optional.ofNullable(this.keepQueryString);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="match")
    private @Nullable String match;

    public Optional<String> match() {
        return Optional.ofNullable(this.match);
    }

    @Import(name="matchMultiple")
    private @Nullable Boolean matchMultiple;

    public Optional<Boolean> matchMultiple() {
        return Optional.ofNullable(this.matchMultiple);
    }

    @Import(name="matchRegex")
    private @Nullable String matchRegex;

    public Optional<String> matchRegex() {
        return Optional.ofNullable(this.matchRegex);
    }

    @Import(name="targetPath")
    private @Nullable String targetPath;

    public Optional<String> targetPath() {
        return Optional.ofNullable(this.targetPath);
    }

    @Import(name="targetPathPrepend")
    private @Nullable String targetPathPrepend;

    public Optional<String> targetPathPrepend() {
        return Optional.ofNullable(this.targetPathPrepend);
    }

    @Import(name="targetRegex")
    private @Nullable String targetRegex;

    public Optional<String> targetRegex() {
        return Optional.ofNullable(this.targetRegex);
    }

    @Import(name="targetUrl")
    private @Nullable String targetUrl;

    public Optional<String> targetUrl() {
        return Optional.ofNullable(this.targetUrl);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorRewriteUrl() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorRewriteUrl(GetPropertyRulesBuilderRulesV20230530BehaviorRewriteUrl $) {
        this.behavior = $.behavior;
        this.keepQueryString = $.keepQueryString;
        this.locked = $.locked;
        this.match = $.match;
        this.matchMultiple = $.matchMultiple;
        this.matchRegex = $.matchRegex;
        this.targetPath = $.targetPath;
        this.targetPathPrepend = $.targetPathPrepend;
        this.targetRegex = $.targetRegex;
        this.targetUrl = $.targetUrl;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorRewriteUrl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorRewriteUrl $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorRewriteUrl();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorRewriteUrl defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorRewriteUrl(Objects.requireNonNull(defaults));
        }

        public Builder behavior(@Nullable String behavior) {
            $.behavior = behavior;
            return this;
        }

        public Builder keepQueryString(@Nullable Boolean keepQueryString) {
            $.keepQueryString = keepQueryString;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder match(@Nullable String match) {
            $.match = match;
            return this;
        }

        public Builder matchMultiple(@Nullable Boolean matchMultiple) {
            $.matchMultiple = matchMultiple;
            return this;
        }

        public Builder matchRegex(@Nullable String matchRegex) {
            $.matchRegex = matchRegex;
            return this;
        }

        public Builder targetPath(@Nullable String targetPath) {
            $.targetPath = targetPath;
            return this;
        }

        public Builder targetPathPrepend(@Nullable String targetPathPrepend) {
            $.targetPathPrepend = targetPathPrepend;
            return this;
        }

        public Builder targetRegex(@Nullable String targetRegex) {
            $.targetRegex = targetRegex;
            return this;
        }

        public Builder targetUrl(@Nullable String targetUrl) {
            $.targetUrl = targetUrl;
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorRewriteUrl build() {
            return $;
        }
    }

}
