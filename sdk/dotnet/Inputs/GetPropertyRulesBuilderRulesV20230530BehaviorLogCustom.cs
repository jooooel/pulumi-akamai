// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorLogCustomArgs : global::Pulumi.InvokeArgs
    {
        [Input("customLogField")]
        public string? CustomLogField { get; set; }

        [Input("locked")]
        public bool? Locked { get; set; }

        [Input("logCustomLogField")]
        public bool? LogCustomLogField { get; set; }

        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        [Input("uuid")]
        public string? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorLogCustomArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorLogCustomArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorLogCustomArgs();
    }
}
