// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorEdgeSideIncludesInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("detectInjection")]
        public Input<bool>? DetectInjection { get; set; }

        [Input("enableViaHttp")]
        public Input<bool>? EnableViaHttp { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("i18nCharsets")]
        private InputList<string>? _i18nCharsets;
        public InputList<string> I18nCharsets
        {
            get => _i18nCharsets ?? (_i18nCharsets = new InputList<string>());
            set => _i18nCharsets = value;
        }

        [Input("i18nStatus")]
        public Input<bool>? I18nStatus { get; set; }

        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("passClientIp")]
        public Input<bool>? PassClientIp { get; set; }

        [Input("passSetCookie")]
        public Input<bool>? PassSetCookie { get; set; }

        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorEdgeSideIncludesInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorEdgeSideIncludesInputArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorEdgeSideIncludesInputArgs();
    }
}