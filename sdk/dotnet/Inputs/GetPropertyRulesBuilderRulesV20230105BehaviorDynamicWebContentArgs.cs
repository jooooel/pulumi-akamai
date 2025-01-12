// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorDynamicWebContentInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("imageCompression")]
        public Input<bool>? ImageCompression { get; set; }

        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("prefetch")]
        public Input<bool>? Prefetch { get; set; }

        [Input("realUserMonitoring")]
        public Input<bool>? RealUserMonitoring { get; set; }

        [Input("sureRoute")]
        public Input<bool>? SureRoute { get; set; }

        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorDynamicWebContentInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorDynamicWebContentInputArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorDynamicWebContentInputArgs();
    }
}
