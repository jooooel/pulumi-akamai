// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorDowngradeProtocolInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorDowngradeProtocolInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorDowngradeProtocolInputArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorDowngradeProtocolInputArgs();
    }
}
