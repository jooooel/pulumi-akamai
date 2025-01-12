// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetCloudletsForwardRewriteMatchRuleMatchRuleForwardSettingsArgs;
import com.pulumi.akamai.inputs.GetCloudletsForwardRewriteMatchRuleMatchRuleMatchArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudletsForwardRewriteMatchRuleMatchRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetCloudletsForwardRewriteMatchRuleMatchRuleArgs Empty = new GetCloudletsForwardRewriteMatchRuleMatchRuleArgs();

    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    @Import(name="end")
    private @Nullable Output<Integer> end;

    public Optional<Output<Integer>> end() {
        return Optional.ofNullable(this.end);
    }

    @Import(name="forwardSettings", required=true)
    private Output<GetCloudletsForwardRewriteMatchRuleMatchRuleForwardSettingsArgs> forwardSettings;

    public Output<GetCloudletsForwardRewriteMatchRuleMatchRuleForwardSettingsArgs> forwardSettings() {
        return this.forwardSettings;
    }

    @Import(name="matchUrl")
    private @Nullable Output<String> matchUrl;

    public Optional<Output<String>> matchUrl() {
        return Optional.ofNullable(this.matchUrl);
    }

    @Import(name="matches")
    private @Nullable Output<List<GetCloudletsForwardRewriteMatchRuleMatchRuleMatchArgs>> matches;

    public Optional<Output<List<GetCloudletsForwardRewriteMatchRuleMatchRuleMatchArgs>>> matches() {
        return Optional.ofNullable(this.matches);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="start")
    private @Nullable Output<Integer> start;

    public Optional<Output<Integer>> start() {
        return Optional.ofNullable(this.start);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private GetCloudletsForwardRewriteMatchRuleMatchRuleArgs() {}

    private GetCloudletsForwardRewriteMatchRuleMatchRuleArgs(GetCloudletsForwardRewriteMatchRuleMatchRuleArgs $) {
        this.disabled = $.disabled;
        this.end = $.end;
        this.forwardSettings = $.forwardSettings;
        this.matchUrl = $.matchUrl;
        this.matches = $.matches;
        this.name = $.name;
        this.start = $.start;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudletsForwardRewriteMatchRuleMatchRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudletsForwardRewriteMatchRuleMatchRuleArgs $;

        public Builder() {
            $ = new GetCloudletsForwardRewriteMatchRuleMatchRuleArgs();
        }

        public Builder(GetCloudletsForwardRewriteMatchRuleMatchRuleArgs defaults) {
            $ = new GetCloudletsForwardRewriteMatchRuleMatchRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        public Builder end(@Nullable Output<Integer> end) {
            $.end = end;
            return this;
        }

        public Builder end(Integer end) {
            return end(Output.of(end));
        }

        public Builder forwardSettings(Output<GetCloudletsForwardRewriteMatchRuleMatchRuleForwardSettingsArgs> forwardSettings) {
            $.forwardSettings = forwardSettings;
            return this;
        }

        public Builder forwardSettings(GetCloudletsForwardRewriteMatchRuleMatchRuleForwardSettingsArgs forwardSettings) {
            return forwardSettings(Output.of(forwardSettings));
        }

        public Builder matchUrl(@Nullable Output<String> matchUrl) {
            $.matchUrl = matchUrl;
            return this;
        }

        public Builder matchUrl(String matchUrl) {
            return matchUrl(Output.of(matchUrl));
        }

        public Builder matches(@Nullable Output<List<GetCloudletsForwardRewriteMatchRuleMatchRuleMatchArgs>> matches) {
            $.matches = matches;
            return this;
        }

        public Builder matches(List<GetCloudletsForwardRewriteMatchRuleMatchRuleMatchArgs> matches) {
            return matches(Output.of(matches));
        }

        public Builder matches(GetCloudletsForwardRewriteMatchRuleMatchRuleMatchArgs... matches) {
            return matches(List.of(matches));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder start(@Nullable Output<Integer> start) {
            $.start = start;
            return this;
        }

        public Builder start(Integer start) {
            return start(Output.of(start));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GetCloudletsForwardRewriteMatchRuleMatchRuleArgs build() {
            $.forwardSettings = Objects.requireNonNull($.forwardSettings, "expected parameter 'forwardSettings' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
